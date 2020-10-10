package com.testapp.justrun.ui.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/testapp/justrun/ui/viewmodels/StatisticsViewModel;", "Landroidx/lifecycle/ViewModel;", "mainRepository", "Lcom/testapp/justrun/repository/MainRepository;", "(Lcom/testapp/justrun/repository/MainRepository;)V", "getRunSortedByDate", "Landroidx/lifecycle/LiveData;", "", "Lcom/testapp/justrun/db/RunEntites;", "getGetRunSortedByDate", "()Landroidx/lifecycle/LiveData;", "getMainRepository", "()Lcom/testapp/justrun/repository/MainRepository;", "totalAvgSpeed", "", "getTotalAvgSpeed", "totalCaloriesBurned", "getTotalCaloriesBurned", "totalDistance", "getTotalDistance", "totalTimeRun", "getTotalTimeRun", "app_debug"})
public final class StatisticsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Long> totalTimeRun = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Long> totalDistance = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Long> totalCaloriesBurned = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Long> totalAvgSpeed = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.testapp.justrun.db.RunEntites>> getRunSortedByDate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.testapp.justrun.repository.MainRepository mainRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Long> getTotalTimeRun() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Long> getTotalDistance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Long> getTotalCaloriesBurned() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Long> getTotalAvgSpeed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.testapp.justrun.db.RunEntites>> getGetRunSortedByDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.testapp.justrun.repository.MainRepository getMainRepository() {
        return null;
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public StatisticsViewModel(@org.jetbrains.annotations.NotNull()
    com.testapp.justrun.repository.MainRepository mainRepository) {
        super();
    }
}