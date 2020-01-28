package com.example.kotlinmvvmposts.injection.component

import com.example.kotlinmvvmposts.injection.module.NetworkModule
import com.example.kotlinmvvmposts.ui.post.PostListViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(NetworkModule::class)])
interface ViewModelInjector {

    fun inject(postListViewModel: PostListViewModel)

    @Component.Builder
    interface Builder {
        fun build(): ViewModelInjector

        fun networkModule(networkModule: NetworkModule): Builder
    }
}