package com.testapp.justrun.di;

import com.testapp.justrun.db.RunDao;
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
public final class AppModule_ProvideRunDaoFactory implements Factory<RunDao> {
  private final Provider<RunningDatabase> databaseProvider;

  public AppModule_ProvideRunDaoFactory(Provider<RunningDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public RunDao get() {
    return provideRunDao(databaseProvider.get());
  }

  public static AppModule_ProvideRunDaoFactory create(Provider<RunningDatabase> databaseProvider) {
    return new AppModule_ProvideRunDaoFactory(databaseProvider);
  }

  public static RunDao provideRunDao(RunningDatabase database) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideRunDao(database), "Cannot return null from a non-@Nullable @Provides method");
  }
}
