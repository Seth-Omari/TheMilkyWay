package com.seth.themilkywayandroidtask.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MilkyWayImage(
    val title: String,
    val description: String,
    val imageUrl: String,
    val date: String,
    val center: String
) : Parcelable
