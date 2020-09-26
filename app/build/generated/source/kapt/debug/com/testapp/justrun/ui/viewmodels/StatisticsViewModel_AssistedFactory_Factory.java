package com.testapp.justrun.ui.viewmodels;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class StatisticsViewModel_AssistedFactory_Factory implements Factory<StatisticsViewModel_AssistedFactory> {
  @Override
  public StatisticsViewModel_AssistedFactory get() {
    return newInstance();
  }

  public static StatisticsViewModel_AssistedFactory_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static StatisticsViewModel_AssistedFactory newInstance() {
    return new StatisticsViewModel_AssistedFactory();
  }

  private static final class InstanceHolder {
    private static final StatisticsViewModel_AssistedFactory_Factory INSTANCE = new StatisticsViewModel_AssistedFactory_Factory();
  }
}
