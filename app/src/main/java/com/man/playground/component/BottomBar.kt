package com.man.playground.component

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import com.man.playground.navigation.BottomBarDestination

/**
 *
 * Created by Lukmanul Hakim on  22/05/23
 * devs.lukman@gmail.com
 */

@Composable
fun BottomBar(
    navController: NavController,
    currentDestination: NavDestination?,
    isDarkTheme: Boolean
) {

    NavigationBar(
        modifier = Modifier
            .height(52.dp)
            .shadow(elevation = 16.dp)
            .padding(top = 2.dp)
    ) {

        BottomBarDestination.values().asList().forEach {
            BottomItem(
                screen = it,
                navController = navController,
                currentDestination = currentDestination,
                isDarkTheme = isDarkTheme
            )
        }

    }
}

@Composable
fun RowScope.BottomItem(
    screen: BottomBarDestination,
    navController: NavController,
    currentDestination: NavDestination?,
    isDarkTheme: Boolean
) {

    val isCurrentBottomItemSelected = currentDestination?.hierarchy?.any {
        it.route == screen.route
    } ?: false

    val (iconSize, offsetY) = if (screen == BottomBarDestination.ADD) Pair(42.dp, (-8).dp)
    else Pair(22.dp, 0.dp)

    var icon: Int = screen.unFilledIcon
    screen.apply {
        if (this == BottomBarDestination.ADD) {
            if (isDarkTheme) darkModeIcon?.let { icon = it }
        } else {
            if (isCurrentBottomItemSelected) {
                filledIcon?.let { icon = it }
            }
        }
    }

    NavigationBarItem(
        icon = {
            Icon(
                painter = painterResource(id = icon),
                contentDescription = null,
                modifier = Modifier
                    .padding(bottom = 9.dp)
                    .size(iconSize)
                    .offset(y = offsetY),
                tint = Color.Unspecified
            )
        },
        modifier = Modifier.offset(y = -BottomBarItemVerticalOffset),
        label = {
            screen.title?.let {
                Text(
                    modifier = Modifier.offset(y = BottomBarItemVerticalOffset.times(1.85f)),
                    text = stringResource(id = screen.title),
                    style = MaterialTheme.typography.labelSmall,
                    softWrap = false,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = if (isCurrentBottomItemSelected) 1f else 0.7f)
                )
            }
        },
        colors = NavigationBarItemDefaults.colors(
            indicatorColor = MaterialTheme.colorScheme.surface,
            selectedIconColor = MaterialTheme.colorScheme.secondary,
            selectedTextColor = MaterialTheme.colorScheme.secondary
        ),
        selected = isCurrentBottomItemSelected,
        onClick = {
            screen.route.let {
                navController.navigate(it) {
                    launchSingleTop = true
                }
            }
        },
    )


}

private val BottomBarItemVerticalOffset = 10.dp