package com.testapp.justrun.ui.viewmodels;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class MainViewModel_AssistedFactory implements ViewModelAssistedFactory<MainViewModel> {
  @Inject
  MainViewModel_AssistedFactory() {
  }

  @Override
  @NonNull
  public MainViewModel create(SavedStateHandle arg0) {
    return new MainViewModel();
  }
}
