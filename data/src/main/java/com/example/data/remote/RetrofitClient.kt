package com.example.data.remote

import com.example.data.common.constance.Constance
import com.example.data.remote.apiservice.AnimeListApiService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitClient {
    private val okHttpClient: OkHttpClient = OkHttpClient()
        .newBuilder()
        .addInterceptor(provideLoggingInterceptor())
        .connectTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        .build()

    private fun provideLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
    }

    private val provideRetrofit = Retrofit.Builder()
        .baseUrl(Constance.BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun provideAnimeListApiService(): AnimeListApiService = provideRetrofit.create(
        AnimeListApiService::class.java
    )
}