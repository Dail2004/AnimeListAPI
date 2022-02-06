package com.example.data.remote.dtos.detailDto

import com.google.gson.annotations.SerializedName

data class GenresDto(
    @SerializedName("mal_id")
    val mal_id: Int,

    @SerializedName("type")
    val type: String,

    @SerializedName("name")
    val name: String,

    @SerializedName("url")
    val url: String,
)