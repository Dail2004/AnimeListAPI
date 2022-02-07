package com.example.data.repository

import com.example.data.common.base.BaseRepository
import com.example.domain.common.resource.Resource
import com.example.data.remote.apiservice.AnimeListApiService
import com.example.data.remote.dtos.animeDto.toDomain
import com.example.domain.model.Anime
import com.example.domain.repository.AnimeListRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AnimeListRepositoryImpl @Inject constructor(
    private val service: AnimeListApiService
) : BaseRepository(), AnimeListRepository {

    override fun fetchAnimeList() : Flow<Resource<List<Anime>>> = doRequest {
        service.fetchAnimeList().data.map { it.toDomain() }
    }
}