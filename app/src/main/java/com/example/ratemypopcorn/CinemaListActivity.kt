package com.example.ratemypopcorn

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ratemypopcorn.databinding.ActivityCinemalistBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CinemaListActivity : AppCompatActivity() {
    companion object{
        const val TAG = "CinemaListActivity"
    }
    private lateinit var binding: ActivityCinemalistBinding
    lateinit var adapter: CinemaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCinemalistBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getCinemaDataByGeolocationApiCall()

    }

    private fun getCinemaDataByGeolocationApiCall() {
        val fishDataService = RetrofitHelper.getInstance().create(CinemaDataService::class.java)
        val fishDataCall = fishDataService.getCinemaDataByGeolocation()
        fishDataCall.enqueue(object: Callback<List<CinemaData>> {
            override fun onResponse(
                call: Call<List<CinemaData>>,
                response: Response<List<CinemaData>>
            ) {
                Log.d(TAG, "onResponse: ${response.body()}")
                adapter = CinemaAdapter(response.body()!!)
                binding.recyclerViewCinemaList.adapter = adapter
                binding.recyclerViewCinemaList.layoutManager =
                    LinearLayoutManager(this@CinemaListActivity)
            }

            override fun onFailure(call: Call<List<CinemaData>>, t: Throwable) {
                Log.d(TAG, "onFailure: ${t.message}")
            }
        })
    }
}
}