package com.balajiprabhu.dashboard.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.balajiprabhu.common.Destination
import com.balajiprabhu.common.Feature
import com.balajiprabhu.common.SubGraphDestination
import com.balajiprabhu.dashboard.screens.DashboardScreen

interface DashboardFeature : Feature

class DashboardFeatureImpl : DashboardFeature {
    override fun registerGraph(navGraphBuilder: NavGraphBuilder, navController: NavHostController) {
        navGraphBuilder.navigation<SubGraphDestination.DashboardSubGraph>(
            startDestination = Destination.Dashboard,
        ) {
            composable<Destination.Dashboard> {
                DashboardScreen {
                    navController.navigate(Destination.Auth)
                }
            }
        }
    }
}