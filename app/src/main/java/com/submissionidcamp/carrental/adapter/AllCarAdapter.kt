package com.submissionidcamp.carrental.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.submissionidcamp.carrental.R
import com.submissionidcamp.carrental.model.CarModel

class AllCarAdapter (private var data: List<CarModel>, private val listner:(CarModel) -> Unit ) : RecyclerView.Adapter<AllCarAdapter.CarMovieHolder>() {

    // Inisialisasi
    lateinit var ContextAdapter : Context

    class CarMovieHolder(view : View) : RecyclerView.ViewHolder(view) {
        // Inisialisasi view
        private val ivPosterLandscape:ImageView     = view.findViewById(R.id.iv_poster_landscape)
        private val tvJudul:TextView                = view.findViewById(R.id.tv_judul)
        private val tvPrice:TextView                = view.findViewById(R.id.tv_price)
        private val rbCar:RatingBar                 = view.findViewById(R.id.ratingbar)

        // Menampilkan data yang ada di CarModel
        fun binItem(data: CarModel, listener: (CarModel)-> Unit, context: Context, position: Int) {
            // textview
            tvJudul.text    = data.judul
            tvPrice.text    = data.price_per_day

            // Imageview
            Glide.with(context)
                .load(data.thumbnail_landscape)
                .into(ivPosterLandscape)

           // RatingBar
            rbCar.rating    = data.rating

            // itemView ketika di klik membawa data
            itemView.setOnClickListener {
                listener(data)
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarMovieHolder {
        // Inisialisasi Layout
        val layoutInflater      = LayoutInflater.from(parent.context)
        ContextAdapter          = parent.context

        val inflatedView: View  = layoutInflater.inflate(R.layout.item_carrental_vertical, parent, false)
        return CarMovieHolder(inflatedView)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: CarMovieHolder, position: Int) {
        // OnBind
        // Menghubungkan dan memanggil kelas bindItem
        holder.binItem(data[position], listner, ContextAdapter, position)

    }
}