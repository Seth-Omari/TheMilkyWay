package com.seth.themilkywayandroidtask.ui.fragment;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.seth.themilkywayandroidtask.R;
import com.seth.themilkywayandroidtask.databinding.FragmentMilkyWayBinding;
import com.seth.themilkywayandroidtask.model.Item;
import com.seth.themilkywayandroidtask.model.MilkyWayImage;
import com.seth.themilkywayandroidtask.ui.adapter.MilkyWayAdapter;
import com.seth.themilkywayandroidtask.ui.viewmodel.MilkyWayViewModel;
import com.seth.themilkywayandroidtask.utils.NetworkResource;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u001a\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/seth/themilkywayandroidtask/ui/fragment/MilkyWayFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/seth/themilkywayandroidtask/databinding/FragmentMilkyWayBinding;", "milkWayAdapter", "Lcom/seth/themilkywayandroidtask/ui/adapter/MilkyWayAdapter;", "viewModel", "Lcom/seth/themilkywayandroidtask/ui/viewmodel/MilkyWayViewModel;", "getViewModel", "()Lcom/seth/themilkywayandroidtask/ui/viewmodel/MilkyWayViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "navigate", "", "milkyWayImage", "Lcom/seth/themilkywayandroidtask/model/MilkyWayImage;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MilkyWayFragment extends androidx.fragment.app.Fragment {
    private com.seth.themilkywayandroidtask.databinding.FragmentMilkyWayBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.seth.themilkywayandroidtask.ui.adapter.MilkyWayAdapter milkWayAdapter;
    private java.util.HashMap _$_findViewCache;
    
    private final com.seth.themilkywayandroidtask.ui.viewmodel.MilkyWayViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void navigate(com.seth.themilkywayandroidtask.model.MilkyWayImage milkyWayImage) {
    }
    
    public MilkyWayFragment() {
        super();
    }
}