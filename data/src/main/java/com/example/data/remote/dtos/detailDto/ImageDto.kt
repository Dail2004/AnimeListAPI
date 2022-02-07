package com.example.data.remote.dtos.detailDto

import com.example.domain.model.detailmodel.ImageModel
import com.google.gson.annotations.SerializedName

data class ImageDto(
    @SerializedName("image_url")
    val image_url: String,
    @SerializedName("small_image_url")
    val small_image_url: String,
    @SerializedName("large_image_url")
    val large_image_url: String,
)

fun ImageDto.toDomain() = ImageModel(
    image_url, small_image_url, large_image_url
)