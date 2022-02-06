package com.example.data.remote.apiservice

import com.example.data.remote.dtos.animeDto.AnimeDto
import com.example.data.remote.dtos.animeDto.AnimeResponseDto
import retrofit2.http.GET

interface AnimeListApiService {

    @GET("/anime/{id}")
    suspend fun fetchAnimeList(): AnimeResponseDto<AnimeDto>
}