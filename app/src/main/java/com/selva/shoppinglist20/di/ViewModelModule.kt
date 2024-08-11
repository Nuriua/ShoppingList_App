package com.selva.shoppinglist20.di

import androidx.lifecycle.ViewModel
import com.selva.shoppinglist20.presentation.MainViewModel
import com.selva.shoppinglist20.presentation.ShopItemViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    fun binMainViewModel(viewModel: MainViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ShopItemViewModel::class)
    fun binShopItemViewModel(viewModel: ShopItemViewModel): ViewModel
}