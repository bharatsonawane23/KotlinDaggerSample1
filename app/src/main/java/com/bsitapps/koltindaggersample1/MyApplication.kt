package com.bsitapps.koltindaggersample1

import android.app.Application
import com.bsitapps.koltindaggersample1.data.local.DatabaseService
import com.bsitapps.koltindaggersample1.data.remote.NetworkService
import javax.inject.Inject

class MyApplication : Application() {
    @Inject
    private lateinit var networkService: NetworkService

    @Inject
    private lateinit var databaseService: DatabaseService

    override fun onCreate() {
        super.onCreate()
    }
}