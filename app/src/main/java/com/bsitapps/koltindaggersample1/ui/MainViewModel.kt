package com.bsitapps.koltindaggersample1.ui

import com.bsitapps.koltindaggersample1.data.local.DatabaseService
import com.bsitapps.koltindaggersample1.data.remote.NetworkService
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val databaseService: DatabaseService,
    private val networkService: NetworkService
) {


    fun getDummyString(): String = "${databaseService.getDummy()} ${networkService.getDummy()}"
}