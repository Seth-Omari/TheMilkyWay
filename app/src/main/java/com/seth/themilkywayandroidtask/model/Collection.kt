package com.seth.themilkywayandroidtask.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Collection(
    val version: String,
    val href: String,
    val items: List<Item>,
    val metadata: CollectionMetadata
) : Parcelable
