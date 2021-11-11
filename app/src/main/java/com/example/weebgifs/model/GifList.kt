package com.example.weebgifs.model

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class GifList (
    val url: List<Gif>,
        ) : Parcelable

@Parcelize
@JsonClass(generateAdapter = true)
data class Gif (
    val url: String,
    @Json(name = "anime_name")
    val animeName: String,
        ) : Parcelable
