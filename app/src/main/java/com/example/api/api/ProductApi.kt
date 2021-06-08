package com.example.api.api

import android.telecom.Call
import retrofit2.http.GET
import com.example.api.model.Product

interface ProductApi {
    @GET("getdata.php")
    fun getProductApi(): Call<List<Product>>
}