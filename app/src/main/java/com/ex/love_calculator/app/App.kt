package com.ex.love_calculator.app

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Singleton

@HiltAndroidApp
class App: Application() {
    @Module
    @InstallIn(SingletonComponent::class)
    object AppModule {

        @Provides
        @Singleton
        fun provideDatabase(appContext: Context): LoveDatabase {
            return Room.databaseBuilder(
                appContext,
                LoveDatabase::class.java,
                "love_database"
            ).build()
        }

        @Provides
        fun provideLoveDao(db: LoveDatabase): LoveDao {
            return db.loveDao()
        }
    }
}