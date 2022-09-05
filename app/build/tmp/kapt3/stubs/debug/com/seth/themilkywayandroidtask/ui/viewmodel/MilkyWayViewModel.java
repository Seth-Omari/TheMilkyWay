package com.seth.themilkywayandroidtask.ui.viewmodel;

import androidx.lifecycle.ViewModel;
import com.seth.themilkywayandroidtask.data.repositories.MilkyWayImagesRepository;
import com.seth.themilkywayandroidtask.utils.*;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/seth/themilkywayandroidtask/ui/viewmodel/MilkyWayViewModel;", "Landroidx/lifecycle/ViewModel;", "milkyWayRepository", "Lcom/seth/themilkywayandroidtask/data/repositories/MilkyWayImagesRepository;", "(Lcom/seth/themilkywayandroidtask/data/repositories/MilkyWayImagesRepository;)V", "getMilkyWayImages", "Lkotlinx/coroutines/flow/Flow;", "Lcom/seth/themilkywayandroidtask/utils/NetworkResource;", "Lcom/seth/themilkywayandroidtask/data/remote/MilkyWayResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MilkyWayViewModel extends androidx.lifecycle.ViewModel {
    private final com.seth.themilkywayandroidtask.data.repositories.MilkyWayImagesRepository milkyWayRepository = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMilkyWayImages(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.seth.themilkywayandroidtask.utils.NetworkResource<com.seth.themilkywayandroidtask.data.remote.MilkyWayResponse>>> p0) {
        return null;
    }
    
    @javax.inject.Inject()
    public MilkyWayViewModel(@org.jetbrains.annotations.NotNull()
    com.seth.themilkywayandroidtask.data.repositories.MilkyWayImagesRepository milkyWayRepository) {
        super();
    }
}