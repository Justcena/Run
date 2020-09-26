package com.testapp.justrun.ui.fragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.testapp.justrun.R

class RunFragmentDirections private constructor() {
  companion object {
    fun actionRunFragmentToTrackingFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_runFragment_to_trackingFragment)
  }
}
