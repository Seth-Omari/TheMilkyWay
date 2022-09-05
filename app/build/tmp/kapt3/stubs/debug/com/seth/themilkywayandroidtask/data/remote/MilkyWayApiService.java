package com.seth.themilkywayandroidtask.data.remote;

import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * A retrofit service to fetch the list of Milky Way images taken in 2017.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JA\u0010\u0002\u001a\u00020\u00032\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/seth/themilkywayandroidtask/data/remote/MilkyWayApiService;", "", "getMilkyWayImages", "Lcom/seth/themilkywayandroidtask/data/remote/MilkyWayResponse;", "searchQuery", "", "mediaType", "startYear", "", "endYear", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface MilkyWayApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "search")
    public abstract java.lang.Object getMilkyWayImages(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "q")
    java.lang.String searchQuery, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "media_type")
    java.lang.String mediaType, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "year_start")
    java.lang.Integer startYear, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "year_end")
    java.lang.Integer endYear, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.seth.themilkywayandroidtask.data.remote.MilkyWayResponse> p4);
}