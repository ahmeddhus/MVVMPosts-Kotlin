package com.example.kotlinmvvmposts.network

import com.example.kotlinmvvmposts.model.Post
import io.reactivex.Observable
import retrofit2.http.GET

interface PostApi {

    @GET("/posts")
    fun getPosts(): Observable<List<Post>>
}