package dev.himanshu.myapplication.di

import dev.himanshu.myapplication.ui.SharedTestViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.get
import org.koin.core.module.Module
import org.koin.dsl.module

actual fun viewModelModule(): Module {
    return module { factory { SharedTestViewModel() }}
}

class ViewModelProvider : KoinComponent{

    fun provideSharedTestViewModel(): SharedTestViewModel = get()

}
