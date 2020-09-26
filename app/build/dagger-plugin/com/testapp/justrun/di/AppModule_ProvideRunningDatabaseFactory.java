package com.testapp.justrun.di;

import android.content.Context;
import com.testapp.justrun.db.RunningDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideRunningDatabaseFactory implements Factory<RunningDatabase> {
  private final Provider<Context> contextProvider;

  public AppModule_ProvideRunningDatabaseFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public RunningDatabase get() {
    return provideRunningDatabase(contextProvider.get());
  }

  public static AppModule_ProvideRunningDatabaseFactory create(Provider<Context> contextProvider) {
    return new AppModule_ProvideRunningDatabaseFactory(contextProvider);
  }

  public static RunningDatabase provideRunningDatabase(Context context) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideRunningDatabase(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
