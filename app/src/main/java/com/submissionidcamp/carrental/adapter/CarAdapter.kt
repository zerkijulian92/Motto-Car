package com.submissionidcamp.carrental.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.submissionidcamp.carrental.R
import com.submissionidcamp.carrental.model.CarModel

class CarAdapter (private var data: List<CarModel>, private val listerner:(CarModel) -> Unit) : RecyclerView.Adapter<CarAdapter.CarViewHolder>() {
    // Inisialisasi
    lateinit var ContextAdapter : Context

    class CarViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        // Inisialisasi View
        private val ivPosterPotrait:ImageView   = view.findViewById(R.id.iv_poster_potrait)

        // Casting View
        fun binItem(data: CarModel, listener: (CarModel) -> Unit, context: Context, position: Int) {
            Glide.with(context)
                .load(data.thumbnail_potrait)
                .into(ivPosterPotrait)

            itemView.setOnClickListener {
                listener(data)
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        // Inisiaslisasi Layout
        val layoutInflater      = LayoutInflater.from(parent.context)
        ContextAdapter          = parent.context

        val inflatedView : View = layoutInflater.inflate(R.layout.item_carrental_horizontal, parent, false)
        return CarViewHolder(inflatedView)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
       // onBInd
        holder.binItem(data[position], listerner, ContextAdapter, position)
    }
}