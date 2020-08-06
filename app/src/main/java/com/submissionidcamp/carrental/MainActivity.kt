package com.submissionidcamp.carrental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.submissionidcamp.carrental.adapter.CarAdapter
import com.submissionidcamp.carrental.model.CarModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    // Inisialisasi Code
    private var datalist = ArrayList<CarModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi layout Recyclerview
        rv_carrental.layoutManager  = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        // LoadDatasample
        loadDataSample();

        // Menampilkan recyclerview ( Detail Activity ketika diklik )
        rv_carrental.adapter = CarAdapter(datalist){
            // Menampilkan Data ke Page Detail (Melempar data ke DetailActivity)
            val intent =    Intent(this, DetailActivity::class.java)
                .putExtra("data", it)
            startActivity(intent)

        }

        // Fungsi View All Ketika diKlik
        tv_viewall.setOnClickListener {
            // Menampikan data ke page detail (Berpindah dengan membawa data ke AllCarActivity)
            val intent = Intent(this, AllCarRental::class.java)
                .putExtra("data", datalist)
            startActivity(intent)
        }
    }

    // Memunculkan Menu About di ActionBar
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // Inisialisasi Menu
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Inisialisasi Item yang ada pada menu
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        // Casting item menu
        when (selectedMode) {
            R.id.about -> {
                val aboutIntent = Intent(this@MainActivity, AboutAct::class.java)
                startActivity(aboutIntent)
            }
        }
    }

    // Function loadDataSampe
    private fun loadDataSample() {
        datalist.add(
            CarModel(
                "01",
                "A6 2020 Audi",
                "A6 2020",
                "Audi",
                "Starting from a new design direction first seen in the Audi Prologue concept car, the Audi A6 cuts a sharper profile with acute angles, defined edges and taut, muscular contours. Its lines take the eyes on a journey, while expressive surface language shapes its character.",
                "$ 250/Day",
                R.drawable.potrait_a6_2020,
                R.drawable.landscape_a6_2020,
                rating = 3.5f
            )
        )

        datalist.add(
            CarModel(
                "02",
                "X204 Mercedes-Bens",
                "X204",
                "Mercedes-Benz",
                "Mercedes-Benz traces its origins to Karl Benz's creation of the first internal combustion engine in a car, the Benz Patent Motorwagen, financed by Bertha Benz dowery. and patented in January 1886, and Gottlieb Daimler and engineer Wilhelm Maybach's conversion of a stagecoach by the addition of a petrol engine later that year. The Mercedes automobile was first marketed in 1901 by Daimler-Motoren-Gesellschaft (Daimler Motors Corporation).",
                "$ 300/Day",
                R.drawable.potrait_x204,
                R.drawable.landscape_x204,
                rating = 5.6f
            )
        )

        datalist.add(
            CarModel(
                "03",
                "Honda Jazz",
                "Jazz",
                "Honda",
                "The Honda Jazz is a 5 door hatchback car produced by the Japanese automotive manufacturer Honda Motor Company . The Honda Jazz was first introduced in 2001. The name Honda Jazz is used in Europe, parts of Asia, Australia, Oceania, the Middle East and Africa. In Japan, China and America, this car is named the Honda Fit . Until 2007, 2 million units of Honda Jazz have been sold worldwide.",
                "$ 100/Day",
                R.drawable.potrait_jazz,
                R.drawable.landscape_jazz,
                rating = 3.2f
            )
        )

        datalist.add(
            CarModel(
                "04",
                "Mitshubishi Outlander",
                "Outlander",
                "Mitsubishi",
                "The Mitsubishi Outlander is an SUV produced by Mitsubishi Motors since 2001 for the European , Japanese and US markets . The Mitsubishi Outlander was first launched in 2001 under the name Mitsubishi Airtrek . This car is assembled in Okazaki , Japan and Kaluga , Russia .",
                "$ 130/Day",
                R.drawable.potrait_outlander,
                R.drawable.landscape_outlander,
                rating = 4.9f
            )
        )

        datalist.add(
            CarModel(
                "05",
                "Nissan Pulsar",
                "Pulsar",
                "Nissan",
                "Nissan Pulsar is a compact front-wheel drive car. At first, the Pulsar was a variant of the Nissan Cherry which was the smallest car made by Nissan .\n" +
                        "\n" +
                        "Pulsar is the base for other Nissan cars such as Langley and Liberta Villa which are only sold in Japan , and Arna which is a partnership with Alfa Romeo .\n" +
                        "\n" +
                        "Starting in 1986 , Pulsar became a separate model because Cherry was no longer produced, and Pulsar was also marketed as Nissan Sunny in Europe .\n" +
                        "\n" +
                        "Pulsars that use the N16 platform are sold in several countries as Sunny or Sentra . This model is the same as Bluebird Sylphy in Japan.",
                "$ 145/Day",
                R.drawable.potrait_pulsar,
                R.drawable.landscape_pulsar,
                rating = 3.8f
            )
        )

        datalist.add(
            CarModel(
                "06",
                "Mercedes-Benz S63",
                "S63",
                "Mercedes-Benz",
                "Mercedes-Benz S63 , commonly known asS63, is a division of the German automotive company , Mercedes-Benz . This division specializes in high-performance luxury cars.\n" +
                        "\n" +
                        "All S63models have a more aggressive appearance, better performance, control and stability than ordinary Mercedes models. AMG models are usually the most expensive models of the Mercedes car lineup.",
                "$ 200/Day",
                R.drawable.potrait_s63,
                R.drawable.landscape_s63,
                rating = 5.2f
            )
        )

        datalist.add(
            CarModel(
                "07",
                "Range Rover",
                "Range Rover",
                "Land Rover",
                "Range Rover is a luxury vehicle-type SUV ber 4-wheel manufactured by the British company Land Rover . This model was first launched in 1970 and has now had four generations. The Range Rover was also developed by Land Rover as their luxury car brand. This car brand is also used as the name of 2 other car models namely the Range Rover Evoque and Range Rover Sport .",
                "$ 210/Day",
                R.drawable.potrait_range_rover,
                R.drawable.landscape_range_rover,
                rating = 5.0f
            )
        )

        datalist.add(
            CarModel(
                "08",
                "Ford XLT 2017",
                "Xlt 2017",
                "Ford",
                "The current generation of the Ford Ranger (codenamed T6) is a range of midsize pickup trucks that is manufactured and sold by Ford Motor Company. \n" +
                        "\n" +
                        "Designed and engineered by Ford of Australia,[4] the current generation consolidated worldwide production of the Ranger onto a single platform, replacing the 1998-2012 Ranger (of North/South America)[5] and the Mazda-derived Ford Ranger sold in Latin America, Europe and Asia-Pacific regions. \n" +
                        "\n" +
                        "First unveiled at the Australian International Motor Show in Sydney in October 2010, the Ranger T6 has been produced since the summer of 2011.",
                "$ 100/Day",
                R.drawable.potrait_xlt_2017,
                R.drawable.landscape_xlt_2017,
                rating = 4.8f
            )
        )

        datalist.add(
            CarModel(
                "09",
                "BMW IM3 2006",
                "320i 2006 m3",
                "Bmw",
                "BMW M3 is a high-performance version of the BMW 3 Series was developed by a division of BMW , BMW M . M3 models are taken from the 3-series E30, E36, E46 and E90 / E92 / E93 and are available in coupé , sedan and convertible models .\n" +
                        "\n" +
                        "Upgrades from the regular 3 series version include a more powerful and responsive engine, a more sophisticated control / suspension / brake system, a more aerodynamic body, and a 3-color \"M\" (Motorsport) emblem. \n" +
                        "\n" +
                        "For years the M3 and M5 became competing vehicles for Mercedes-AMG and Audi Quattro GmbH (Audi RS). The last M3 coupe was launched in Germany on July 5, 2013. Henceforth, the M3 name will still be used for the sedan version, but for the coupe the name will change to M4",
                "$ 220/Day",
                R.drawable.potrait_320i,
                R.drawable.landscape_320i,
                rating = 5.0f
            )
        )

        datalist.add(
            CarModel(
                "10",
                "D-max Isuzu",
                "D-max",
                "Isuzu",
                "Isuzu D-Max is a pickup truck produced by Isuzu since 2002. It uses the same platform as several General Motors (GM) models including the Chevrolet Colorado , GMC Canyon and Isuzu i-Series . Chevrolet Colorado uses the same base as D-Max.",
                "$ 80/Day",
                R.drawable.potrait_d_max,
                R.drawable.landscape_d_max,
                rating = 3.1f
            )
        )

    }
}