package com.store.mobile.services

import com.store.mobile.models.ProductModel
import retrofit2.http.GET

interface ApiService {
    @GET("products")
    suspend fun getProduct(): List<ProductModel>
}
