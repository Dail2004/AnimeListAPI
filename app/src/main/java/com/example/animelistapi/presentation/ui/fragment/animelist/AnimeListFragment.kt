package com.example.animelistapi.presentation.ui.fragment.animelist

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.animelistapi.R
import com.example.animelistapi.databinding.FragmentAnimeListBinding
import com.example.animelistapi.common.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AnimeListFragment:
    BaseFragment<FragmentAnimeListBinding, AnimeListViewModel>(R.layout.fragment_anime_list) {
    override val binding by viewBinding(FragmentAnimeListBinding::bind)
    override val viewModel: AnimeListViewModel by viewModels()


}