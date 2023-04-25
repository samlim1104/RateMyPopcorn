package com.example.ratemypopcorn

object RetrofitHelper {
    val baseURL = "https://developer.movieglu.com/api-index/cinemadetails/"

    fun getInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(baseURL).addConverterFactory(GsonConverterFactory.create()).build()
    }

}