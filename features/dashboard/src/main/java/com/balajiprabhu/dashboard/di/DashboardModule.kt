package com.balajiprabhu.dashboard.di

import com.balajiprabhu.dashboard.navigation.DashboardFeature
import com.balajiprabhu.dashboard.navigation.DashboardFeatureImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DashboardModule {
    @Provides
    fun provideDashboardFeatureImpl() : DashboardFeature {
        return DashboardFeatureImpl()
    }
}