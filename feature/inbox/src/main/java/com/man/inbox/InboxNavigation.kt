package com.man.inbox

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.man.core.DestinationRoute

/**
 *
 * Created by Lukmanul Hakim on  24/05/23
 * devs.lukman@gmail.com
 */

fun NavGraphBuilder.inboxNavGraph(navController: NavController) {
    composable(route = DestinationRoute.INBOX_ROUTE) {
        InboxScreen(navController = navController)
    }
}