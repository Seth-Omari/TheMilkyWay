package com.seth.themilkywayandroidtask.ui.adapter;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.RequiresApi;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.seth.themilkywayandroidtask.R;
import com.seth.themilkywayandroidtask.databinding.MilkywayItemBinding;
import com.seth.themilkywayandroidtask.model.MilkyWayImage;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0018B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\u00062\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0016R0\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/seth/themilkywayandroidtask/ui/adapter/MilkyWayAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/seth/themilkywayandroidtask/ui/adapter/MilkyWayAdapter$MilkyWayViewHolder;", "navigate", "Lkotlin/Function1;", "Lcom/seth/themilkywayandroidtask/model/MilkyWayImage;", "", "(Lkotlin/jvm/functions/Function1;)V", "value", "", "milkyWayImages", "getMilkyWayImages", "()Ljava/util/List;", "setMilkyWayImages", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MilkyWayViewHolder", "app_debug"})
public final class MilkyWayAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.seth.themilkywayandroidtask.ui.adapter.MilkyWayAdapter.MilkyWayViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.seth.themilkywayandroidtask.model.MilkyWayImage> milkyWayImages;
    private final kotlin.jvm.functions.Function1<com.seth.themilkywayandroidtask.model.MilkyWayImage, kotlin.Unit> navigate = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.seth.themilkywayandroidtask.model.MilkyWayImage> getMilkyWayImages() {
        return null;
    }
    
    public final void setMilkyWayImages(@org.jetbrains.annotations.NotNull()
    java.util.List<com.seth.themilkywayandroidtask.model.MilkyWayImage> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.seth.themilkywayandroidtask.ui.adapter.MilkyWayAdapter.MilkyWayViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.seth.themilkywayandroidtask.ui.adapter.MilkyWayAdapter.MilkyWayViewHolder holder, int position) {
    }
    
    public MilkyWayAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.seth.themilkywayandroidtask.model.MilkyWayImage, kotlin.Unit> navigate) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\nH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/seth/themilkywayandroidtask/ui/adapter/MilkyWayAdapter$MilkyWayViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewDataBinding", "Lcom/seth/themilkywayandroidtask/databinding/MilkywayItemBinding;", "(Lcom/seth/themilkywayandroidtask/ui/adapter/MilkyWayAdapter;Lcom/seth/themilkywayandroidtask/databinding/MilkywayItemBinding;)V", "getViewDataBinding", "()Lcom/seth/themilkywayandroidtask/databinding/MilkywayItemBinding;", "bind", "", "milkyWayImage", "Lcom/seth/themilkywayandroidtask/model/MilkyWayImage;", "loadImage", "binding", "milkyWayImageRes", "app_debug"})
    public final class MilkyWayViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.seth.themilkywayandroidtask.databinding.MilkywayItemBinding viewDataBinding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.seth.themilkywayandroidtask.model.MilkyWayImage milkyWayImage) {
        }
        
        private final void loadImage(com.seth.themilkywayandroidtask.databinding.MilkywayItemBinding binding, com.seth.themilkywayandroidtask.model.MilkyWayImage milkyWayImageRes) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.seth.themilkywayandroidtask.databinding.MilkywayItemBinding getViewDataBinding() {
            return null;
        }
        
        public MilkyWayViewHolder(@org.jetbrains.annotations.NotNull()
        com.seth.themilkywayandroidtask.databinding.MilkywayItemBinding viewDataBinding) {
            super(null);
        }
    }
}