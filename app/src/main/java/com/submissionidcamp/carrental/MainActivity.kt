package com.submissionidcamp.carrental

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.submissionidcamp.carrental.adapter.CarAdapter
import com.submissionidcamp.carrental.model.CarModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    // Inisialisasi
    private var datalist = ArrayList<CarModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi layout Recyclerview
        rv_carrental.layoutManager  = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        // LoadDatasample
        loadDataSample();

        // Menampilkan recyclerview
        rv_carrental.adapter = CarAdapter(datalist){

        }
    }

    // Function loadDataSampe
    private fun loadDataSample() {
        datalist.add(
            CarModel(
                "01",
                "A6 2020",
                "Audi",
                "Production 1994 - present Executive 4-door luxury sedan model; introduced in 1994. Equipped with a redesigned bumper, grille, front and rear lights, et al.",
                "$ 50",
                R.drawable.potrait_a6_2020,
                R.drawable.landscape_a6_2020,
                rating = 3.0f
            )
        )

        datalist.add(
            CarModel(
                "02",
                "X204",
                "Mercedes-Benz",
                "",
                "$ 50",
                R.drawable.potrait_x204,
                R.drawable.landscape_x204,
                rating = 3.0f
            )
        )

        datalist.add(
            CarModel(
                "03",
                "Jazz",
                "Honda",
                "",
                "$ 50",
                R.drawable.potrait_jazz,
                R.drawable.landscape_jazz,
                rating = 3.0f
            )
        )

        datalist.add(
            CarModel(
                "04",
                "Outlander",
                "Mitsubishi",
                "",
                "$ 50",
                R.drawable.potrait_outlander,
                R.drawable.landscape_outlander,
                rating = 3.0f
            )
        )

        datalist.add(
            CarModel(
                "05",
                "Pulsar",
                "Nissan",
                "",
                "$ 50",
                R.drawable.potrait_pulsar,
                R.drawable.landscape_pulsar,
                rating = 3.0f
            )
        )

        datalist.add(
            CarModel(
                "06",
                "S63",
                "Mercedes-Benz",
                "",
                "$ 50",
                R.drawable.potrait_s63,
                R.drawable.landscape_s63,
                rating = 3.0f
            )
        )

        datalist.add(
            CarModel(
                "07",
                "Range Rover",
                "Land Rover",
                "",
                "$ 50",
                R.drawable.potrait_range_rover,
                R.drawable.landscape_range_rover,
                rating = 3.0f
            )
        )

        datalist.add(
            CarModel(
                "08",
                "Xlt 2017",
                "Ford",
                "",
                "$ 50",
                R.drawable.potrait_xlt_2017,
                R.drawable.landscape_xlt_2017,
                rating = 3.0f
            )
        )

        datalist.add(
            CarModel(
                "09",
                "320i 2006 m3",
                "Bmw",
                "",
                "$ 50",
                R.drawable.potrait_320i,
                R.drawable.landscape_320i,
                rating = 3.0f
            )
        )

        datalist.add(
            CarModel(
                "10",
                "D-max",
                "Isuzu",
                "",
                "$ 50",
                R.drawable.potrait_d_max,
                R.drawable.landscape_d_max,
                rating = 3.0f
            )
        )

    }
}