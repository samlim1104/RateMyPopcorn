package com.example.ratemypopcorn

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class CinemaData(
    @SerializedName("Cinema Name")
    val cinema_name: String?,
    @SerializedName("Cinema Addy")
    val address: String?,
    @SerializedName("Cinema City")
    val city: String?,
) : Parcelable
