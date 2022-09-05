package com.seth.themilkywayandroidtask.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.seth.themilkywayandroidtask.data.repositories.MilkyWayImagesRepository
import com.seth.themilkywayandroidtask.utils.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.flow
import javax.inject.Inject


@HiltViewModel
class MilkyWayViewModel @Inject constructor(
    private val milkyWayRepository: MilkyWayImagesRepository
) : ViewModel() {

    suspend fun getMilkyWayImages() = flow {
        emit(NetworkResource.Loading)
        emit(milkyWayRepository.getMilkyWayImages(SEARCH_QUERY, MEDIA_TYPE, START_YEAR, END_YEAR))
    }
}