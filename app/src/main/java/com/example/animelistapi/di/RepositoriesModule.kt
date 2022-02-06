package com.example.animelistapi.di

import com.example.data.repository.AnimeListRepositoryImpl
import com.example.domain.repository.AnimeListRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoriesModule {
    @Binds
    abstract fun provideTopNewsRepository(
        animeListRepositoriesImpl: AnimeListRepositoryImpl,
    ): AnimeListRepository
}