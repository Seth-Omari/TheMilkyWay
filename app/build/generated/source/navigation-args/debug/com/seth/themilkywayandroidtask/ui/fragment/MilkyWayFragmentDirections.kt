package com.seth.themilkywayandroidtask.ui.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.seth.themilkywayandroidtask.R
import com.seth.themilkywayandroidtask.model.MilkyWayImage
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class MilkyWayFragmentDirections private constructor() {
  private data class ToMilkyWayDetailsFragment(
    public val milkyWayImage: MilkyWayImage
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.to_milkyWayDetailsFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(MilkyWayImage::class.java)) {
        result.putParcelable("milky_way_image", this.milkyWayImage as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(MilkyWayImage::class.java)) {
        result.putSerializable("milky_way_image", this.milkyWayImage as Serializable)
      } else {
        throw UnsupportedOperationException(MilkyWayImage::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  public companion object {
    public fun toMilkyWayDetailsFragment(milkyWayImage: MilkyWayImage): NavDirections =
        ToMilkyWayDetailsFragment(milkyWayImage)
  }
}
