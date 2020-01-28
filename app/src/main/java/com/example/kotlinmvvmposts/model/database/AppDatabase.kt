package com.example.kotlinmvvmposts.model.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.kotlinmvvmposts.model.Post
import com.example.kotlinmvvmposts.model.PostDao

@Database(entities = arrayOf(Post::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun postDao(): PostDao
}