package com.man.domain.following

import com.man.data.model.ContentCreatorFollowingModel
import com.man.data.repository.home.FollowingRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 *
 * Created by Lukmanul Hakim on  26/05/23
 * devs.lukman@gmail.com
 */
class GetContentCreatorsUseCase @Inject constructor(private val followingRepository: FollowingRepository) {
    operator fun invoke(): Flow<List<ContentCreatorFollowingModel>> {
        return followingRepository.getContentCreatorForFollowing()
    }
}