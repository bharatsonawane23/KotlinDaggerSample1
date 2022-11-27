package com.bsitapps.koltindaggersample1.ui

import com.bsitapps.koltindaggersample1.data.local.DatabaseService
import com.bsitapps.koltindaggersample1.data.remote.NetworkService
import javax.inject.Inject

class MainViewModel {

    private lateinit var databaseService: DatabaseService
    private lateinit var networkService: NetworkService

    @Inject
    constructor(databaseService: DatabaseService, networkService: NetworkService) {
        this.databaseService = databaseService
        this.networkService = networkService
    }

    public fun getDummyString(): String {
        return "Hello Dagger"
    }
}