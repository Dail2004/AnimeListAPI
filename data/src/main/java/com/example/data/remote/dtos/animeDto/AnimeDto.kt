package com.example.data.remote.dtos.animeDto

import com.example.data.remote.dtos.detailDto.GenresDto
import com.example.data.remote.dtos.detailDto.ProducersDto
import com.example.data.remote.dtos.detailDto.StudiosDto
import com.example.data.remote.dtos.detailDto.toDomain
import com.example.domain.model.Anime
import com.google.gson.annotations.SerializedName

data class AnimeDto(
    @SerializedName("mal_id")
    val mal_id: Int,

    @SerializedName("image")
    val image: String,

    @SerializedName("url")
    val url: String,

    @SerializedName("title")
    val title: String,

    @SerializedName("type")
    val type: String,

    @SerializedName("title_synonyms")
    val title_synonyms: String,

    @SerializedName("status")
    val status: String,

    @SerializedName("duration")
    val duration: String,

    @SerializedName("rating")
    val rating: String,

    @SerializedName("episodes")
    val episodes: String,

    @SerializedName("synopsis")
    val synopsis: String,

    @SerializedName("producers")
    val producers: ProducersDto,

    @SerializedName("studios")
    val studios: StudiosDto,

    @SerializedName("genres")
    val genres: GenresDto,
)

fun AnimeDto.toDomain() = Anime(
    mal_id,
    image,
    url,
    title,
    type,
    title_synonyms,
    status,
    duration,
    rating,
    episodes,
    synopsis,
    producers.toDomain(),
    studios.toDomain(),
    genres.toDomain(),
)