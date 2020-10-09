package com.testapp.justrun.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0012\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0007J\u001a\u0010\u0010\u001a\n \u0011*\u0004\u0018\u00010\u00060\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u000fH\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0015"}, d2 = {"Lcom/testapp/justrun/di/AppModule;", "", "()V", "provideFirstTimeToggle", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "provideName", "", "provideRunDao", "Lcom/testapp/justrun/db/RunDao;", "database", "Lcom/testapp/justrun/db/RunningDatabase;", "provideRunningDatabase", "context", "Landroid/content/Context;", "provideSharedPreferences", "kotlin.jvm.PlatformType", "app", "provideWeight", "", "app_debug"})
@dagger.Module()
public final class AppModule {
    public static final com.testapp.justrun.di.AppModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.testapp.justrun.db.RunningDatabase provideRunningDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.testapp.justrun.db.RunDao provideRunDao(@org.jetbrains.annotations.NotNull()
    com.testapp.justrun.db.RunningDatabase database) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    public final android.content.SharedPreferences provideSharedPreferences(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final java.lang.String provideName(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    public final float provideWeight(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences) {
        return 0.0F;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    public final boolean provideFirstTimeToggle(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences) {
        return false;
    }
    
    private AppModule() {
        super();
    }
}