package com.seth.themilkywayandroidtask.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

/**
 * A retrofit service to fetch the list of Milky Way images taken in 2017.
 */
interface MilkyWayApiService {

    @GET("search")
    suspend fun getMilkyWayImages(
        @Query("q") searchQuery: String?,
        @Query("media_type") mediaType: String?,
        @Query("year_start") startYear: Int?,
        @Query("year_end") endYear: Int?
    ): MilkyWayResponse

}