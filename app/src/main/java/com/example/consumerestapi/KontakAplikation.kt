package com.example.consumerestapi

import android.app.Application
import com.example.consumerestapi.repository.AppContainer
import com.example.consumerestapi.repository.KontakContainer

class KontakAplikation: Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = KontakContainer()
    }
}