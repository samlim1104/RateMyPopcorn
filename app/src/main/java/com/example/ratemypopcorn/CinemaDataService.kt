package com.example.ratemypopcorn

import retrofit2.Call
import retrofit2.http.GET

interface CinemaDataService {
    @GET("geolocation")
    fun getCinemaDataByGeolocation(): Call<List<CinemaData>>
}