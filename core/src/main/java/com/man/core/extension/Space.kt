package com.man.core.extension

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 *
 * Created by Lukmanul Hakim on  24/05/23
 * devs.lukman@gmail.com
 */

@Composable
fun Int.Space() = Spacer(
    modifier = Modifier
        .height(this.dp)
)

@Composable
fun SmallSpace() = Spacer(modifier = Modifier.height(16.dp))

@Composable
fun MediumSpace() = Spacer(modifier = Modifier.height(26.dp))

@Composable
fun LargeSpace() = Spacer(modifier = Modifier.height(32.dp))