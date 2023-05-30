package com.man.home.tab.following

import androidx.lifecycle.viewModelScope
import com.man.core.base.BaseViewModel
import com.man.domain.following.GetContentCreatorsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 *
 * Created by Lukmanul Hakim on  26/05/23
 * devs.lukman@gmail.com
 */
@HiltViewModel
class FollowingViewModel @Inject constructor(
    private val getContentCreatorsUseCase: GetContentCreatorsUseCase
) : BaseViewModel<ViewState, FollowingEvent>() {

    init {
        getContentCreator()
    }

    override fun onTriggerEvent(event: FollowingEvent) {

    }

    private fun getContentCreator() {
        viewModelScope.launch {
            getContentCreatorsUseCase().collect() {
                updateState(ViewState(contentCreators = it))
            }
        }
    }

}