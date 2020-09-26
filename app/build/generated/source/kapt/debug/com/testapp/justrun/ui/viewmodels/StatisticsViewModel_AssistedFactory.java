package com.testapp.justrun.ui.viewmodels;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class StatisticsViewModel_AssistedFactory implements ViewModelAssistedFactory<StatisticsViewModel> {
  @Inject
  StatisticsViewModel_AssistedFactory() {
  }

  @Override
  @NonNull
  public StatisticsViewModel create(SavedStateHandle arg0) {
    return new StatisticsViewModel();
  }
}
