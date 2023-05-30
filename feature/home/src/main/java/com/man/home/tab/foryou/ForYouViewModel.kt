package com.man.home.tab.foryou

import androidx.lifecycle.viewModelScope
import com.man.core.base.BaseViewModel
import com.man.domain.foryou.GetForYouPageFeedUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 *
 * Created by Lukmanul Hakim on  26/05/23
 * devs.lukman@gmail.com
 */
@HiltViewModel
class ForYouViewModel @Inject constructor(
    private val getForYouPageFeedUseCase: GetForYouPageFeedUseCase
) : BaseViewModel<ViewState, ForYouEvent>() {
    init {
        getForYouPageFeeds()
    }

    private fun getForYouPageFeeds() {
        viewModelScope.launch {
            getForYouPageFeedUseCase().collect {
                updateState(ViewState(forYouPageFeed = it))
            }
        }
    }

    override fun onTriggerEvent(event: ForYouEvent) {

    }


}