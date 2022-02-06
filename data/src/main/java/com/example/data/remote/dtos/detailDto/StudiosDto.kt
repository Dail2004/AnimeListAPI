package com.example.data.remote.dtos.detailDto

import com.example.domain.model.detailmodel.ProducersModel
import com.example.domain.model.detailmodel.StudiosModel
import com.google.gson.annotations.SerializedName

data class StudiosDto (
    @SerializedName("mal_id")
    val mal_id: Int,

    @SerializedName("type")
    val type: String,

    @SerializedName("name")
    val name: String,

    @SerializedName("url")
    val url: String,
)

fun StudiosDto.toDomain() = StudiosModel(
    mal_id, type, name, url
)