package com.balajiprabhu.typesafenav.di

import com.balajiprabhu.auth.navigation.AuthFeature
import com.balajiprabhu.dashboard.navigation.DashboardFeature

data class DefaultNavigator(
    val authFeature: AuthFeature,
    val dashboardFeature: DashboardFeature
)
