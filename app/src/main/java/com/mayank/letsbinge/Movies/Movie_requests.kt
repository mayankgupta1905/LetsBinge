package com.mayank.letsbinge.Movies

import com.mayank.letsbinge.API_KEY
import com.mayank.letsbinge.Movie_card_item_list
import retrofit2.Call
import retrofit2.http.GET


interface Movie_requests {

    // Now Playing
    @GET("movie/now_playing?api_key=$API_KEY&language=en-US&page=1")
    fun movies_now_showing() : Call<Movie_card_item_list>


    //Top Rated
    @GET("movie/top_rated?api_key=$API_KEY&language=en-US&page=1")
    fun movies_toprated() : Call<Movie_card_item_list>


    //Popular
    @GET("movie/popular?api_key=$API_KEY&language=en-US&page=1")
    fun movies_popular() : Call<Movie_card_item_list>


    //Upcoming
    @GET("movie/upcoming?api_key=$API_KEY&language=en-US&page=1")
    fun movies_upcoming() : Call<Movie_card_item_list>


    //Trending per week
    @GET("trending/movie/week?api_key=$API_KEY&language=en-US&page=1")
    fun movies_trending() : Call<Movie_card_item_list>
}