package com.qingmei2.sample.di

import android.app.Application
import androidx.room.Room
import com.qingmei2.sample.db.UserDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideUserDatabase(application: Application): UserDatabase {
        return Room.databaseBuilder(application, UserDatabase::class.java, "user")
                .fallbackToDestructiveMigration()
                .build()
    }
}
