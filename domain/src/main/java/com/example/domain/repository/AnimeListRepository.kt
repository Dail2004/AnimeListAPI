package com.example.domain.repository

import com.example.domain.model.Anime
import com.example.domain.common.resource.Resource
import kotlinx.coroutines.flow.Flow

interface AnimeListRepository {
    fun fetchAnimeList(): Flow<Resource<List<Anime>>>
}