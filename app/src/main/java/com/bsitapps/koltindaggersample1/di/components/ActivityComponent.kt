package com.bsitapps.koltindaggersample1.di.components

import com.bsitapps.koltindaggersample1.di.module.ActivityModule
import com.bsitapps.koltindaggersample1.ui.MainActivity
import dagger.Component

@Component(modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)
}