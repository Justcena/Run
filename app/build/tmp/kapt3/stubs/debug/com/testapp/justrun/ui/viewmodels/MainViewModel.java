package com.testapp.justrun.ui.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0010"}, d2 = {"Lcom/testapp/justrun/ui/viewmodels/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "mainRepository", "Lcom/testapp/justrun/repository/MainRepository;", "(Lcom/testapp/justrun/repository/MainRepository;)V", "getMainRepository", "()Lcom/testapp/justrun/repository/MainRepository;", "runSortedByDate", "Landroidx/lifecycle/LiveData;", "", "Lcom/testapp/justrun/db/RunEntites;", "getRunSortedByDate", "()Landroidx/lifecycle/LiveData;", "insertRun", "Lkotlinx/coroutines/Job;", "runEntites", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.testapp.justrun.db.RunEntites>> runSortedByDate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.testapp.justrun.repository.MainRepository mainRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.testapp.justrun.db.RunEntites>> getRunSortedByDate() {
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