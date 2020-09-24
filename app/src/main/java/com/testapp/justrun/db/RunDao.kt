package com.testapp.justrun.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface RunDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRun(run: RunEntites)


    @Delete
    suspend fun deleteRun(run: RunEntites)


    @Query("SELECT * FROM running_table ORDER BY timestamp DESC")
    fun getAllRunSortedByDate(): LiveData<List<RunEntites>>


    @Query("SELECT * FROM running_table ORDER BY timeInMillis DESC")
    fun getAllRunSortedByTimeInMillis(): LiveData<List<RunEntites>>


    @Query("SELECT * FROM running_table ORDER BY caloriesBurned DESC")
    fun getAllRunSortedByCaloriesBurned(): LiveData<List<RunEntites>>


    @Query("SELECT * FROM running_table ORDER BY avgSpeedInKMH DESC")
    fun getAllRunSortedByAvgSpeed(): LiveData<List<RunEntites>>


    @Query("SELECT * FROM running_table ORDER BY distanceInMeters DESC")
    fun getAllRunSortedByDistance(): LiveData<List<RunEntites>>


    @Query("SELECT SUM(timeInMillis) FROM running_table")
    fun getTotalTimeInMillis(): LiveData<Long>


    @Query("SELECT SUM(caloriesBurned) FROM running_table")
    fun getTotalCaloriesBurned(): LiveData<Long>


    @Query("SELECT SUM(distanceInMeters) FROM running_table")
    fun getTotalDistanceInMeter(): LiveData<Long>


    @Query("SELECT SUM(avgSpeedInKMH) FROM running_table")
    fun getTotalAvgSpeedInKMH(): LiveData<Long>
}