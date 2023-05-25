package com.man.data.model

/**
 *
 * Created by Lukmanul Hakim on  22/05/23
 * devs.lukman@gmail.com
 */
data class AudioModel(
    val audioCoverImage:String,
    val isOriginal:Boolean,
    val audioAuthor:UserModel,
    val numberOfPost:Long,
    val originalVideoUrl:String,
)