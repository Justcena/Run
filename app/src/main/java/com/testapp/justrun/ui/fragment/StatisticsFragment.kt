package com.testapp.justrun.ui.fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.testapp.justrun.R
import com.testapp.justrun.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment : Fragment(R.layout.fragment_statistics) {
    private val viewModel: MainViewModel by viewModels()

}