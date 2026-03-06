package dev.himanshu.myapplication

import android.app.Application
import dev.himanshu.myapplication.di.initKoin

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin()
    }
}