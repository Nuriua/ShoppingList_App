package com.selva.shoppinglist20.di

import android.app.Application
import com.selva.shoppinglist20.data.AppDatabase
import com.selva.shoppinglist20.data.ShopListDao
import com.selva.shoppinglist20.data.ShopListRepositoryImpl
import com.selva.shoppinglist20.domain.ShopListRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindShopListRepository(impl: ShopListRepositoryImpl): ShopListRepository

    companion object {

        @ApplicationScope
        @Provides
        fun provideShopListDao(
            application: Application
        ): ShopListDao {
            return AppDatabase.getInstance(application).shopListDao()
        }
    }
}