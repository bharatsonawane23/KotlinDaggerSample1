package com.bsitapps.koltindaggersample1.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bsitapps.koltindaggersample1.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textHello: TextView = findViewById(R.id.textHello)
        textHello.text = mainViewModel.getDummyString()

    }
}