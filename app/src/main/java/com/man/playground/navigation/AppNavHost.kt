package com.man.playground.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.man.authentication.authenticationNavGraph
import com.man.cameramedia.cameraMediaNavGraph
import com.man.core.DestinationRoute.HOME_SCREEN_ROUTE
import com.man.friends.friendsNavGraph
import com.man.home.homeNavGraph
import com.man.inbox.inboxNavGraph
import com.man.myprofile.myProfileNavGraph

/**
 *
 * Created by Lukmanul Hakim on  24/05/23
 * devs.lukman@gmail.com
 */

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    startDestination: String = HOME_SCREEN_ROUTE
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        homeNavGraph(navController)
        friendsNavGraph(navController)
        cameraMediaNavGraph(navController)
        inboxNavGraph(navController)
        myProfileNavGraph(navController)
        authenticationNavGraph(navController)
    }
}