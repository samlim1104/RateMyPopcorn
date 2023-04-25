package com.example.ratemypopcorn

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

object RetrofitHelper {
    val baseURL = "https://developer.movieglu.com/api-index/cinemadetails/"

    fun getInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(baseURL).addConverterFactory(GsonConverterFactory.create()).build()
    }

}