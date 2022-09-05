package com.seth.themilkywayandroidtask.data.repositories;

import com.seth.themilkywayandroidtask.data.remote.MilkyWayApiService;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Repository used to access list of milky way images being loaded from network call
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J7\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/seth/themilkywayandroidtask/data/repositories/MilkyWayImagesRepository;", "Lcom/seth/themilkywayandroidtask/data/repositories/BaseRepository;", "milkyWayApi", "Lcom/seth/themilkywayandroidtask/data/remote/MilkyWayApiService;", "(Lcom/seth/themilkywayandroidtask/data/remote/MilkyWayApiService;)V", "getMilkyWayImages", "Lcom/seth/themilkywayandroidtask/utils/NetworkResource;", "Lcom/seth/themilkywayandroidtask/data/remote/MilkyWayResponse;", "searchQuery", "", "mediaType", "startYear", "", "endYear", "(Ljava/lang/String;Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@javax.inject.Singleton()
public final class MilkyWayImagesRepository extends com.seth.themilkywayandroidtask.data.repositories.BaseRepository {
    private final com.seth.themilkywayandroidtask.data.remote.MilkyWayApiService milkyWayApi = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMilkyWayImages(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull()
    java.lang.String mediaType, int startYear, int endYear, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.seth.themilkywayandroidtask.utils.NetworkResource<com.seth.themilkywayandroidtask.data.remote.MilkyWayResponse>> p4) {
        return null;
    }
    
    @javax.inject.Inject()
    public MilkyWayImagesRepository(@org.jetbrains.annotations.NotNull()
    com.seth.themilkywayandroidtask.data.remote.MilkyWayApiService milkyWayApi) {
        super();
    }
}