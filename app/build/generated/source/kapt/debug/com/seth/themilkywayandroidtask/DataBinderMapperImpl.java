package com.seth.themilkywayandroidtask;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.seth.themilkywayandroidtask.databinding.ActivityMainBindingImpl;
import com.seth.themilkywayandroidtask.databinding.FragmentMilkyWayBindingImpl;
import com.seth.themilkywayandroidtask.databinding.FragmentMilkyWayDetailsBindingImpl;
import com.seth.themilkywayandroidtask.databinding.MilkywayItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTMILKYWAY = 2;

  private static final int LAYOUT_FRAGMENTMILKYWAYDETAILS = 3;

  private static final int LAYOUT_MILKYWAYITEM = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.seth.themilkywayandroidtask.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.seth.themilkywayandroidtask.R.layout.fragment_milky_way, LAYOUT_FRAGMENTMILKYWAY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.seth.themilkywayandroidtask.R.layout.fragment_milky_way_details, LAYOUT_FRAGMENTMILKYWAYDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.seth.themilkywayandroidtask.R.layout.milkyway_item, LAYOUT_MILKYWAYITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMILKYWAY: {
          if ("layout/fragment_milky_way_0".equals(tag)) {
            return new FragmentMilkyWayBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_milky_way is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMILKYWAYDETAILS: {
          if ("layout/fragment_milky_way_details_0".equals(tag)) {
            return new FragmentMilkyWayDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_milky_way_details is invalid. Received: " + tag);
        }
        case  LAYOUT_MILKYWAYITEM: {
          if ("layout/milkyway_item_0".equals(tag)) {
            return new MilkywayItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for milkyway_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/activity_main_0", com.seth.themilkywayandroidtask.R.layout.activity_main);
      sKeys.put("layout/fragment_milky_way_0", com.seth.themilkywayandroidtask.R.layout.fragment_milky_way);
      sKeys.put("layout/fragment_milky_way_details_0", com.seth.themilkywayandroidtask.R.layout.fragment_milky_way_details);
      sKeys.put("layout/milkyway_item_0", com.seth.themilkywayandroidtask.R.layout.milkyway_item);
    }
  }
}
