package com.man.data.model

import android.net.Uri

/**
 *
 * Created by Lukmanul Hakim on  22/05/23
 * devs.lukman@gmail.com
 */

data class TemplateModel(
    val id: Long,
    val name: String,
    val hint: String,
    val mediaUrl: String
){
    fun parseMediaLink(): Uri = Uri.parse("file:///android_asset/templateimages/${mediaUrl}")
}