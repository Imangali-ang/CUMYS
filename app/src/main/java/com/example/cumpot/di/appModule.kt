package com.example.cumpot.di

import com.example.cumpot.data.database.CumysDatabase
import com.example.cumpot.data.repository.CumysRepository
import com.example.cumpot.second.SecondViewModel
import com.example.cumpot.third.ThirdViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single<CumysDatabase> { CumysDatabase.getInstance(androidApplication()) }

    single<CumysRepository> {
        CumysRepository(get<CumysDatabase>().dao())
    }

    viewModel<SecondViewModel> {
        SecondViewModel(get())
    }

    viewModel<ThirdViewModel> {
        ThirdViewModel(get())
    }
}