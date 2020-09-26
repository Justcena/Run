package com.testapp.justrun.ui.fragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.testapp.justrun.R

class TrackingFragmentDirections private constructor() {
  companion object {
    fun actionTrackingFragmentToRunFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_trackingFragment_to_runFragment)
  }
}
