package com.testapp.justrun.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.testapp.justrun.db.RunEntites
import com.testapp.justrun.repository.MainRepository
import kotlinx.coroutines.launch

class MainViewModel @ViewModelInject constructor(val mainRepository: MainRepository) : ViewModel() {


    val runSortedByDate = mainRepository.getAllRunSortedByDate()

    fun insertRun(runEntites: RunEntites) = viewModelScope.launch {
        mainRepository.insertRun(runEntites)
    }
}