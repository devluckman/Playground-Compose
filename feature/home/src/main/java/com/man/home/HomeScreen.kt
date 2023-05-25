package com.man.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Tab
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.man.home.tab.following.FollowingScreen
import com.man.home.tab.foryou.ForYouTabScreen
import com.man.theme.TikTokTheme
import com.man.theme.R
import kotlinx.coroutines.launch

/**
 *
 * Created by Lukmanul Hakim on  24/05/23
 * devs.lukman@gmail.com
 */
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(
    navController: NavController
) {

    val tabItems = arrayListOf(R.string.following, R.string.for_you)
    val pagerState = rememberPagerState(initialPage = 1)
    val coroutineScope = rememberCoroutineScope()

    TikTokTheme(darkTheme = true) {
        Box(modifier = Modifier.fillMaxSize()) {

            HorizontalPager(
                pageCount = tabItems.size,
                state = pagerState
            ) {
                when (it) {
                    0 -> FollowingScreen(navController = navController)
                    1 -> ForYouTabScreen(navController = navController)
                }
            }

            val edge = LocalConfiguration.current.screenWidthDp.dp.div(2).minus(100.dp)
            ScrollableTabRow(
                selectedTabIndex = pagerState.currentPage,
                containerColor = Color.Transparent,
                modifier = Modifier.padding(top = 8.dp),
                indicator = { tabPosition ->
                    val modifier = Modifier
                        .tabIndicatorOffset(tabPosition[pagerState.currentPage])
                        .padding(horizontal = 38.dp)

                    TabRowDefaults.Indicator(
                        modifier, color = Color.White
                    )
                },
                edgePadding = edge,
                divider = {}
            ) {

                tabItems.forEachIndexed { index, item ->
                    val isSelected = pagerState.currentPage == item
                    Tab(
                        selected = isSelected,
                        onClick = {
                            coroutineScope.launch {
                                pagerState.animateScrollToPage(index)
                            }
                        },
                        text = {
                            val textStyle = if (isSelected) MaterialTheme.typography.titleSmall.merge(
                                TextStyle(color = Color.White)
                            ) else TextStyle(
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 17.sp,
                                color = Color.White.copy(alpha = 0.6f)
                            )

                            Text(text = stringResource(id = item), style = textStyle)
                        }
                    )

                }

            }

        }
    }

}