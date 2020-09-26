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
public final class MainViewModel_AssistedFactory_Factory implements Factory<MainViewModel_AssistedFactory> {
  @Override
  public MainViewModel_AssistedFactory get() {
    return newInstance();
  }

  public static MainViewModel_AssistedFactory_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static MainViewModel_AssistedFactory newInstance() {
    return new MainViewModel_AssistedFactory();
  }

  private static final class InstanceHolder {
    private static final MainViewModel_AssistedFactory_Factory INSTANCE = new MainViewModel_AssistedFactory_Factory();
  }
}
