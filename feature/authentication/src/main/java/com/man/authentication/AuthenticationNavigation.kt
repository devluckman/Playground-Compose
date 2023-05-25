package com.man.authentication

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi
import com.google.accompanist.navigation.material.bottomSheet
import com.man.core.DestinationRoute.AUTHENTICATION_ROUTE

/**
 *
 * Created by Lukmanul Hakim on  25/05/23
 * devs.lukman@gmail.com
 */

@OptIn(ExperimentalMaterialNavigationApi::class)
fun NavGraphBuilder.authenticationNavGraph(navController: NavController) {
    bottomSheet(route = AUTHENTICATION_ROUTE) {
        AuthenticationScreen(navController = navController)
    }
}