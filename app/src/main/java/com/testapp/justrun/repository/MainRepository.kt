package com.testapp.justrun.repository

import com.testapp.justrun.db.RunDao
import com.testapp.justrun.db.RunEntites
import javax.inject.Inject

class MainRepository @Inject constructor(
    val runDao: RunDao
) {


    suspend fun insertRun(run: RunEntites) = runDao.insertRun(run)

    suspend fun deleteRun(run: RunEntites) = runDao.deleteRun(run)

    fun getAllRunSortedByDate() = runDao.getAllRunSortedByDate()
    fun getAllRunSortedByDistance() = runDao.getAllRunSortedByDistance()
    fun getAllRunSortedByTimeInMillis() = runDao.getAllRunSortedByTimeInMillis()
    fun getAllRunSortedByAvgSpeed() = runDao.getAllRunSortedByAvgSpeed()
    fun getAllRunSortedByCaloriesBurned() = runDao.getAllRunSortedByCaloriesBurned()

    fun getTotalAvgSpeed() = runDao.getTotalAvgSpeedInKMH()
    fun getTotalDistance() = runDao.getTotalDistanceInMeter()
    fun getTotalCaloriesBurned() = runDao.getTotalCaloriesBurned()
    fun getTotalTimeInMillis() = runDao.getTotalTimeInMillis()

}