package com.man.home

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.man.core.DestinationRoute.HOME_SCREEN_ROUTE

/**
 *
 * Created by Lukmanul Hakim on  24/05/23
 * devs.lukman@gmail.com
 */

fun NavGraphBuilder.homeNavGraph(navController: NavController) {
    composable(route = HOME_SCREEN_ROUTE) {
        HomeScreen(navController = navController)
    }
}