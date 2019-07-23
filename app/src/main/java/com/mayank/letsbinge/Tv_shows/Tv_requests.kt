package com.mayank.letsbinge.Tv_shows

import com.mayank.letsbinge.API_KEY
import com.mayank.letsbinge.Movie_card_item_list
import retrofit2.Call
import retrofit2.http.GET

interface Tv_requests {

    //top rated
    @GET("tv/top_rated?api_key=$API_KEY&language=en-US&page=1")
    fun tv_toprated() : Call<Movie_card_item_list>


    //popular
    @GET("tv/popular?api_key=$API_KEY&language=en-US&page=1")
    fun tv_popular() : Call<Movie_card_item_list>


    //trending
    @GET("trending/tv/week?api_key=$API_KEY&language=en-US&page=1")
    fun tv_trending() : Call<Movie_card_item_list>

}