package com.balajiprabhu.common

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController

interface Feature {
    fun registerGraph(navGraphBuilder: NavGraphBuilder, navController: NavHostController)
}