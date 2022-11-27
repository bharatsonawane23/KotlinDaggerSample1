package com.bsitapps.koltindaggersample1.di.components

import com.bsitapps.koltindaggersample1.MyApplication
import dagger.Component

@Component(modules = [ApplicationComponent::class])
interface ApplicationComponent {
    fun inject(myApplication: MyApplication)
}