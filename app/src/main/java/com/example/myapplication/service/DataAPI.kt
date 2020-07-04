package com.example.myapplication.service

import com.example.myapplication.model.ModelData
import io.reactivex.Single
import retrofit2.http.GET

interface DataAPI {
    //https://api.github.com/users/hadley/
    @GET("v2/top-headlines?country=tr&category=technology&apiKey=fe4970f0f8a44ed18e89e7a4d4b1adbc")
    fun getBaseData(): Single<List<ModelData>>
}