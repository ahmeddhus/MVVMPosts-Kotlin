package com.example.kotlinmvvmposts.base

import androidx.lifecycle.ViewModel
import com.example.kotlinmvvmposts.injection.component.DaggerViewModelInjector
import com.example.kotlinmvvmposts.injection.component.ViewModelInjector
import com.example.kotlinmvvmposts.injection.module.NetworkModule
import com.example.kotlinmvvmposts.ui.post.PostListViewModel


abstract class BaseViewModel:ViewModel(){
    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
        }
    }
}