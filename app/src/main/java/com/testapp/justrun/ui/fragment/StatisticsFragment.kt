package com.testapp.justrun.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.testapp.justrun.R
import com.testapp.justrun.other.TrackingUtility
import com.testapp.justrun.ui.viewmodels.MainViewModel
import com.testapp.justrun.ui.viewmodels.StatisticsViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_statistics.*
import kotlin.math.round

@AndroidEntryPoint
class StatisticsFragment : Fragment(R.layout.fragment_statistics) {
    private val viewModel: StatisticsViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        subscribeToObservers()
    }

    private fun subscribeToObservers() {
        viewModel.totalTimeRun.observe(viewLifecycleOwner, Observer {
            it?.let {
                val totalTimeRun = TrackingUtility.getFormattedSopWatch(it)
                tvTotalTime.text = totalTimeRun
            }
        })

        viewModel.totalDistance.observe(viewLifecycleOwner, Observer {
            it?.let {
                val km = it / 1000
                val totalDistance = round(km * 10f) / 10f
                val totalDistanceString = "$totalDistance km"
                tvTotalDistance.text = totalDistanceString
            }
        })


        viewModel.totalAvgSpeed.observe(viewLifecycleOwner, Observer {
            it.let {
                val avgSpeed = round(it * 10f) / 10f
                val avgSpeedString = "$avgSpeed km/h"
                tvAverageSpeed.text = avgSpeedString
            }
        })

        viewModel.totalCaloriesBurned.observe(viewLifecycleOwner, Observer {
            it.let {
                val totalCalories = "$it kcal"
                tvTotalCalories.text = totalCalories
            }
        })
    }

}