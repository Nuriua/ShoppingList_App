package com.selva.shoppinglist20.presentation

import android.app.Application
import com.selva.shoppinglist20.di.DaggerApplicationComponent

class ShopApplication: Application() {

    val component by lazy {
        DaggerApplicationComponent.factory().create(this)
    }
}