package com.balajiprabhu.auth.di

import com.balajiprabhu.auth.navigation.AuthFeature
import com.balajiprabhu.auth.navigation.AuthFeatureImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AuthModule {
    @Provides
    fun provideAuthFeatureImpl() : AuthFeature {
        return AuthFeatureImpl()
    }
}