package dev.himanshu.myapplication.di

import dev.himanshu.myapplication.ui.SharedTestViewModel
import org.koin.core.module.Module
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

actual fun viewModelModule(): Module {
    return module {
        viewModel { SharedTestViewModel() }
    }
}