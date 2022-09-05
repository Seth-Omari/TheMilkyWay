package com.seth.themilkywayandroidtask.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Link(
    val href: String,
    val rel: String,
    val render: String
) : Parcelable