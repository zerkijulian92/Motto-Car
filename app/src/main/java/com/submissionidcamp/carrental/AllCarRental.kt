package com.submissionidcamp.carrental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.submissionidcamp.carrental.adapter.AllCarAdapter
import com.submissionidcamp.carrental.model.CarModel
import kotlinx.android.synthetic.main.content_all_car.*

class AllCarRental : AppCompatActivity() {
    // Inisialisasi
    private var datalist = ArrayList<CarModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_car_rental)

        // Menangkap data yang dilempar dari MainActivity
        datalist    = intent.getParcelableArrayListExtra("data")

        rv_car_all.layoutManager = LinearLayoutManager(this)

        rv_car_all.adapter =
            AllCarAdapter(datalist) {
                val intent = Intent(this, DetailActivity::class.java)
                    .putExtra("data", it)
                startActivity(intent)
            }
    }
}