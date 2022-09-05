package com.seth.themilkywayandroidtask.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Item(
    val href: String,
    val data: List<Data>,
    val links: List<Link>
) : Parcelable