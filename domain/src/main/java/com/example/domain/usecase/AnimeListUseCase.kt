package com.example.domain.usecase

import com.example.domain.repository.AnimeListRepository
import javax.inject.Inject

class AnimeListUseCase @Inject constructor(
    private val repository: AnimeListRepository
) {
    operator fun invoke() = repository.fetchAnimeList()
}