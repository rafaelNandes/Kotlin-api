package com.example.api.api

import retrofit2.Call
import retrofit2.http.GET
import com.example.api.model.Product

interface ProductApi {
    @GET("getdata.php")
    fun getProductApi(): Call<List<Product>>
}