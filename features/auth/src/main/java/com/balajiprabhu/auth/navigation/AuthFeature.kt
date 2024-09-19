package com.balajiprabhu.auth.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.balajiprabhu.auth.screens.AuthScreen
import com.balajiprabhu.common.Destination
import com.balajiprabhu.common.Feature
import com.balajiprabhu.common.SubGraphDestination

interface AuthFeature : Feature

class AuthFeatureImpl : AuthFeature {
    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavHostController
    ) {
        navGraphBuilder.navigation<SubGraphDestination.AuthSubGraph>(
            startDestination = Destination.Auth,
        ) {
            composable<Destination.Auth> {
                AuthScreen {
                    navController.navigate(Destination.Dashboard)
                }
            }
        }
    }
}