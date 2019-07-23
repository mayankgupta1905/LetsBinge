package com.mayank.letsbinge.Movies

import com.mayank.letsbinge.link
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Movies_Client {

    val retrofitClient = Retrofit.Builder()
        .baseUrl("$link")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service = retrofitClient.create(Movie_requests::class.java)

    fun<T> retrofitCallBack(fn: (Response<T>?, Throwable?) -> Unit): Callback<T> {
        return object : Callback<T> {
            override fun onFailure(call: Call<T>, e: Throwable) = fn(null, e)

            override fun onResponse(call: Call<T>, response: Response<T>?) = fn(response, null)
        }
    }

}