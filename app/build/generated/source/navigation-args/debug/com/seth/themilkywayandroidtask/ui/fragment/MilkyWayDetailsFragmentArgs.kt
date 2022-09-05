package com.seth.themilkywayandroidtask.ui.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.seth.themilkywayandroidtask.model.MilkyWayImage
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class MilkyWayDetailsFragmentArgs(
  public val milkyWayImage: MilkyWayImage
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
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

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): MilkyWayDetailsFragmentArgs {
      bundle.setClassLoader(MilkyWayDetailsFragmentArgs::class.java.classLoader)
      val __milkyWayImage : MilkyWayImage?
      if (bundle.containsKey("milky_way_image")) {
        if (Parcelable::class.java.isAssignableFrom(MilkyWayImage::class.java) ||
            Serializable::class.java.isAssignableFrom(MilkyWayImage::class.java)) {
          __milkyWayImage = bundle.get("milky_way_image") as MilkyWayImage?
        } else {
          throw UnsupportedOperationException(MilkyWayImage::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__milkyWayImage == null) {
          throw IllegalArgumentException("Argument \"milky_way_image\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"milky_way_image\" is missing and does not have an android:defaultValue")
      }
      return MilkyWayDetailsFragmentArgs(__milkyWayImage)
    }
  }
}
