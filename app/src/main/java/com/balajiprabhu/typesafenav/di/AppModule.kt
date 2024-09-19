package com.balajiprabhu.typesafenav.di

import com.balajiprabhu.auth.navigation.AuthFeature
import com.balajiprabhu.dashboard.navigation.DashboardFeature
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    fun provideDefaultNavigator(
        authFeature: AuthFeature,
        dashboardFeature: DashboardFeature
    ): DefaultNavigator {
        return DefaultNavigator(
            authFeature = authFeature,
            dashboardFeature = dashboardFeature
        )
    }
}