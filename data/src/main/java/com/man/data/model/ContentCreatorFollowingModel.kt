package com.man.data.model

import android.net.Uri

/**
 *
 * Created by Lukmanul Hakim on  22/05/23
 * devs.lukman@gmail.com
 */

data class ContentCreatorFollowingModel(
    val userModel: UserModel,
    val coverVideo: VideoModel
) {
    fun parseVideo(): Uri = Uri.parse("asset:///videos/${coverVideo.videoLink}")
}