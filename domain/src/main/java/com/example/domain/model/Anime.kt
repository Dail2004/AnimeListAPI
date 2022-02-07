package com.example.domain.model

import com.example.domain.model.detailmodel.GenresModel
import com.example.domain.model.detailmodel.ImageModel
import com.example.domain.model.detailmodel.ProducersModel
import com.example.domain.model.detailmodel.StudiosModel

class Anime(
    val mal_id: Int,
    val image: ImageModel,
    val url: String,
    val title: String,
    val type: String,
    val title_synonyms: String,
    val status: String,
    val duration: String,
    val rating: String,
    val episodes: String,
    val synopsis: String,
    val producers: ProducersModel,
    val studios: StudiosModel,
    val genres: GenresModel,
)