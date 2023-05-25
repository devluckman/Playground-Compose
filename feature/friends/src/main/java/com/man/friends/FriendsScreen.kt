package com.man.friends

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.man.core.DestinationRoute.AUTHENTICATION_ROUTE

/**
 *
 * Created by Lukmanul Hakim on  24/05/23
 * devs.lukman@gmail.com
 */

@Composable
fun FriendsScreen(navController: NavController) {
    Scaffold{
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
        ) {

        }
    }

    LaunchedEffect(key1 = Unit) {
        navController.apply {
            popBackStack()
            navController.navigate(AUTHENTICATION_ROUTE)
        }
    }
}