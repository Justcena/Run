package com.testapp.justrun.ui.fragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.testapp.justrun.R

class SetupFragmentDirections private constructor() {
  companion object {
    fun actionSetupFragmentToRunFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_setupFragment_to_runFragment)
  }
}
