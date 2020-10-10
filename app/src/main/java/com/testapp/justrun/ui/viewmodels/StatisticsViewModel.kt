package com.testapp.justrun.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.testapp.justrun.repository.MainRepository

class StatisticsViewModel @ViewModelInject constructor(val mainRepository: MainRepository) :
    ViewModel() {


    val totalTimeRun = mainRepository.getTotalTimeInMillis()
    val totalDistance = mainRepository.getTotalDistance()
    val totalCaloriesBurned = mainRepository.getTotalCaloriesBurned()
    val totalAvgSpeed = mainRepository.getTotalAvgSpeed()

    val getRunSortedByDate = mainRepository.getAllRunSortedByDate()

}