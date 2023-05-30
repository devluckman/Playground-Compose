package com.man.home.tab.foryou

import com.man.data.model.VideoModel

/**
 *
 * Created by Lukmanul Hakim on  26/05/23
 * devs.lukman@gmail.com
 */

data class ViewState(
    val forYouPageFeed: List<VideoModel>? = null,
    val isLoading: Boolean? = null,
    val error: String? = null,
)

sealed class ForYouEvent {
}