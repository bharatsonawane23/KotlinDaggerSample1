package com.bsitapps.koltindaggersample1.data.local

import android.content.Context
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DatabaseService @Inject constructor(
    private var context: Context,
    private var databaseName: String,
    private var version: Int
) {
    fun getDummy(): String = "DatabaseDummyValue"
}

