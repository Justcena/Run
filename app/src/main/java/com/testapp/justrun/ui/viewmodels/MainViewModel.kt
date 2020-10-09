package com.testapp.justrun.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.testapp.justrun.db.RunEntites
import com.testapp.justrun.other.SortType
import com.testapp.justrun.repository.MainRepository
import kotlinx.coroutines.launch

class MainViewModel @ViewModelInject constructor(val mainRepository: MainRepository) : ViewModel() {


    val runSortedByDate = mainRepository.getAllRunSortedByDate()
    private val runSortedByDistance = mainRepository.getAllRunSortedByDistance()
    private val runSortedByCaloriesBurned = mainRepository.getAllRunSortedByCaloriesBurned()
    private val runSortedByTimeInMillis = mainRepository.getAllRunSortedByTimeInMillis()
    private val runSortedByAvgSpeed = mainRepository.getAllRunSortedByAvgSpeed()

    val runs = MediatorLiveData<List<RunEntites>>()

    var sortType = SortType.DATE

    init {
        runs.addSource(runSortedByDate) {
            if (sortType == SortType.DATE) {
                it.let { runs.value = it }
            }
        }
        runs.addSource(runSortedByAvgSpeed) {
            if (sortType == SortType.AVG_SPEED) {
                it.let { runs.value = it } ?: sortType == SortType.AVG_SPEED
            }
        }
        runs.addSource(runSortedByTimeInMillis) {
            if (sortType == SortType.RUNNING_TIME) {
                it.let { runs.value = it }
            }
        }
        runs.addSource(runSortedByDistance) {
            if (sortType == SortType.DISTANCE) {
                it.let { runs.value = it }
            }
        }
        runs.addSource(runSortedByCaloriesBurned) {
            if (sortType == SortType.CALORIES_BURNED) {
                it.let { runs.value = it }
            }
        }
    }

    fun sortRuns(sortType: SortType) = when (sortType) {
        SortType.DATE -> runSortedByDate.value?.let { runs.value = it }
        SortType.CALORIES_BURNED -> runSortedByCaloriesBurned.value?.let { runs.value = it }
        SortType.AVG_SPEED -> runSortedByAvgSpeed.value?.let { runs.value = it }
        SortType.RUNNING_TIME -> runSortedByTimeInMillis.value?.let { runs.value = it }
        SortType.DISTANCE -> runSortedByDistance.value?.let { runs.value = it }
    }.also {
        this.sortType = sortType
    }

    fun insertRun(runEntites: RunEntites) = viewModelScope.launch {
        mainRepository.insertRun(runEntites)
    }
}