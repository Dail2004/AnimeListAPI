package com.example.data.remote.dtos.animeDto

import com.google.gson.annotations.SerializedName

data class AnimeResponseDto<T>(
    @SerializedName("data")
    val data: List<T>
)