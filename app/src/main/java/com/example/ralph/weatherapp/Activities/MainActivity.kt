package com.example.ralph.weatherapp.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.ralph.weatherapp.Adapters.ForecastListAdapter
import com.example.ralph.weatherapp.R

class MainActivity : AppCompatActivity() {
    val items = listOf<String>(
            "Sunday: Hot",
            "Monday: Humid",
            "Tuesday: Cloudy",
            "Wednesday: Cloudy",
            "Thursday: Humid",
            "Friday: Hot",
            "Saturday: Pleasant"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val forecastListView = findViewById<RecyclerView>(R.id.forecast_list)
        forecastListView.layoutManager = LinearLayoutManager(this)
        forecastListView.adapter = ForecastListAdapter(items)
    }
}
