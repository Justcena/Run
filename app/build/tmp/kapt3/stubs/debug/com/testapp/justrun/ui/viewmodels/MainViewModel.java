package com.testapp.justrun.ui.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\nJ\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\u0002\u0010 R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006!"}, d2 = {"Lcom/testapp/justrun/ui/viewmodels/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "mainRepository", "Lcom/testapp/justrun/repository/MainRepository;", "(Lcom/testapp/justrun/repository/MainRepository;)V", "getMainRepository", "()Lcom/testapp/justrun/repository/MainRepository;", "runSortedByAvgSpeed", "Landroidx/lifecycle/LiveData;", "", "Lcom/testapp/justrun/db/RunEntites;", "runSortedByCaloriesBurned", "runSortedByDate", "getRunSortedByDate", "()Landroidx/lifecycle/LiveData;", "runSortedByDistance", "runSortedByTimeInMillis", "runs", "Landroidx/lifecycle/MediatorLiveData;", "getRuns", "()Landroidx/lifecycle/MediatorLiveData;", "sortType", "Lcom/testapp/justrun/other/SortType;", "getSortType", "()Lcom/testapp/justrun/other/SortType;", "setSortType", "(Lcom/testapp/justrun/other/SortType;)V", "insertRun", "Lkotlinx/coroutines/Job;", "runEntites", "sortRuns", "", "(Lcom/testapp/justrun/other/SortType;)Lkotlin/Unit;", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.testapp.justrun.db.RunEntites>> runSortedByDate = null;
    private final androidx.lifecycle.LiveData<java.util.List<com.testapp.justrun.db.RunEntites>> runSortedByDistance = null;
    private final androidx.lifecycle.LiveData<java.util.List<com.testapp.justrun.db.RunEntites>> runSortedByCaloriesBurned = null;
    private final androidx.lifecycle.LiveData<java.util.List<com.testapp.justrun.db.RunEntites>> runSortedByTimeInMillis = null;
    private final androidx.lifecycle.LiveData<java.util.List<com.testapp.justrun.db.RunEntites>> runSortedByAvgSpeed = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<java.util.List<com.testapp.justrun.db.RunEntites>> runs = null;
    @org.jetbrains.annotations.NotNull()
    private com.testapp.justrun.other.SortType sortType = com.testapp.justrun.other.SortType.DATE;
    @org.jetbrains.annotations.NotNull()
    private final com.testapp.justrun.repository.MainRepository mainRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.testapp.justrun.db.RunEntites>> getRunSortedByDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<java.util.List<com.testapp.justrun.db.RunEntites>> getRuns() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.testapp.justrun.other.SortType getSortType() {
        return null;
    }
    
    public final void setSortType(@org.jetbrains.annotations.NotNull()
    com.testapp.justrun.other.SortType p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit sortRuns(@org.jetbrains.annotations.NotNull()
    com.testapp.justrun.other.SortType sortType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insertRun(@org.jetbrains.annotations.NotNull()
    com.testapp.justrun.db.RunEntites runEntites) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.testapp.justrun.repository.MainRepository getMainRepository() {
        return null;
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.testapp.justrun.repository.MainRepository mainRepository) {
        super();
    }
}