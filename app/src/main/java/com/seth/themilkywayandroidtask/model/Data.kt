package com.seth.themilkywayandroidtask.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Data(
    val album: List<String>,
    val center: String,
    val title: String,
    val keywords: List<String>,
    val location: String,
    val nasa_id: String,
    val date_created: String,
    val media_type: String,
    val description: String
) : Parcelable
