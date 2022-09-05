package com.seth.themilkywayandroidtask.data.repositories

import com.seth.themilkywayandroidtask.data.remote.MilkyWayApiService
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Repository used to access list of milky way images being loaded from network call
 */

@Singleton
class MilkyWayImagesRepository @Inject constructor(private val milkyWayApi: MilkyWayApiService) :
    BaseRepository() {

    suspend fun getMilkyWayImages(
        searchQuery: String,
        mediaType: String,
        startYear: Int,
        endYear: Int
    ) = safeApiCall {
        milkyWayApi.getMilkyWayImages(searchQuery, mediaType, startYear, endYear)
    }

}