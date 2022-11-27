package com.bsitapps.koltindaggersample1.data.remote

import android.content.Context
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NetworkService @Inject constructor(
    private var context: Context,
    private var apiKey: String
)