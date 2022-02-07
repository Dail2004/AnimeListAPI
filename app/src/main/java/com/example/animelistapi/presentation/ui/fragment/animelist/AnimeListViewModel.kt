package com.example.animelistapi.presentation.ui.fragment.animelist

import com.example.animelistapi.common.BaseViewModel
import com.example.domain.usecase.AnimeListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AnimeListViewModel @Inject constructor(
    private  val animeListUseCase: AnimeListUseCase
) : BaseViewModel() {


}