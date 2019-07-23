package com.mayank.letsbinge

data class Movie_card_item(

    val id:Int,
    val title: String,
    val poster_path:String,
    val vote_average:Float,
    val backdrop_path:String
    )

data class Movie_card_item_list(
    val results : ArrayList<Movie_card_item>
)