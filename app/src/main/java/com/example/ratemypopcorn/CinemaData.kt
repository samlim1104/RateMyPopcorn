package com.example.ratemypopcorn

import com.google.gson.annotations.SerializedName

@Parcelize
data class CinemaData(
    @SerializedName("Species Name")
    val speciesName: String?,
) : Parcelable
