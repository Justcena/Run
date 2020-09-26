package com.testapp.justrun.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\rJ\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\rJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\rJ\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\rJ\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\rJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\rJ\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\rJ\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\rJ\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\rJ\u0019\u0010\u0018\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/testapp/justrun/repository/MainRepository;", "", "runDao", "Lcom/testapp/justrun/db/RunDao;", "(Lcom/testapp/justrun/db/RunDao;)V", "getRunDao", "()Lcom/testapp/justrun/db/RunDao;", "deleteRun", "", "run", "Lcom/testapp/justrun/db/RunEntites;", "(Lcom/testapp/justrun/db/RunEntites;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllRunSortedByAvgSpeed", "Landroidx/lifecycle/LiveData;", "", "getAllRunSortedByCaloriesBurned", "getAllRunSortedByDate", "getAllRunSortedByDistance", "getAllRunSortedByTimeInMillis", "getTotalAvgSpeed", "", "getTotalCaloriesBurned", "getTotalDistance", "getTotalTimeInMillis", "insertRun", "app_debug"})
public final class MainRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.testapp.justrun.db.RunDao runDao = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertRun(@org.jetbrains.annotations.NotNull()
    com.testapp.justrun.db.RunEntites run, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteRun(@org.jetbrains.annotations.NotNull()
    com.testapp.justrun.db.RunEntites run, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.testapp.justrun.db.RunEntites>> getAllRunSortedByDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.testapp.justrun.db.RunEntites>> getAllRunSortedByDistance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.testapp.justrun.db.RunEntites>> getAllRunSortedByTimeInMillis() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.testapp.justrun.db.RunEntites>> getAllRunSortedByAvgSpeed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.testapp.justrun.db.RunEntites>> getAllRunSortedByCaloriesBurned() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Long> getTotalAvgSpeed() {
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
    public final androidx.lifecycle.LiveData<java.lang.Long> getTotalTimeInMillis() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.testapp.justrun.db.RunDao getRunDao() {
        return null;
    }
    
    @javax.inject.Inject()
    public MainRepository(@org.jetbrains.annotations.NotNull()
    com.testapp.justrun.db.RunDao runDao) {
        super();
    }
}