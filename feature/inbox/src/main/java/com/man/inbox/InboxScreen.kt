package com.man.inbox

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.man.composable.CustomButton
import com.man.composable.TopBar
import com.man.core.DestinationRoute
import com.man.theme.R
import com.man.theme.SubTextColor

/**
 *
 * Created by Lukmanul Hakim on  24/05/23
 * devs.lukman@gmail.com
 */

@Composable
fun InboxScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopBar(
                navIcon = null,
                title = stringResource(id = com.man.theme.R.string.inbox)
            )
        }
    ) {
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
        ) {

            UnAuthorizedInboxScreen {
                navController.navigate(DestinationRoute.AUTHENTICATION_ROUTE)
            }

        }
    }
}

@Composable
fun UnAuthorizedInboxScreen(onClickSignup: () -> Unit) {

    Column(
        modifier = Modifier
            .fillMaxHeight(0.8f)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(20.dp, alignment = Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.ic_msg),
            contentDescription = null,
            modifier = Modifier.size(68.dp)
        )
        Text(
            text = stringResource(id = R.string.message_and_notifications_will_appear_here),
            color = SubTextColor
        )
        CustomButton(
            buttonText = stringResource(id = R.string.sign_up),
            modifier = Modifier.fillMaxWidth(0.66f),
            onClickButton = onClickSignup
        )
    }

}