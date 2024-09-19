package com.balajiprabhu.typesafenav

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.balajiprabhu.common.SubGraphDestination
import com.balajiprabhu.typesafenav.di.DefaultNavigator
import com.balajiprabhu.typesafenav.ui.theme.TypeSafeNavTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var defaultNavigator: DefaultNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TypeSafeNavTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                  Box(modifier = Modifier.padding(innerPadding)) {
                      AppNavigation(modifier = Modifier, defaultNavigator = defaultNavigator)
                  }
                }
            }
        }
    }
}


@Composable
fun AppNavigation(
    modifier: Modifier = Modifier,
    defaultNavigator: DefaultNavigator
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController, startDestination = SubGraphDestination.AuthSubGraph
    ) {
        defaultNavigator.authFeature.registerGraph(
            navController = navController, navGraphBuilder = this
        )
        defaultNavigator.dashboardFeature.registerGraph(
            navController = navController, navGraphBuilder = this
        )
    }
}