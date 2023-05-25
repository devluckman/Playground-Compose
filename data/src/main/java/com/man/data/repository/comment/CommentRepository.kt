package com.man.data.repository.comment

import com.man.data.model.CommentList
import com.man.data.source.CommentDataSource.fetchComment
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 *
 * Created by Lukmanul Hakim on  22/05/23
 * devs.lukman@gmail.com
 */
class CommentRepository @Inject constructor() {
    fun getComment(videoId: String): Flow<CommentList> {
        return fetchComment(videoId)
    }
}