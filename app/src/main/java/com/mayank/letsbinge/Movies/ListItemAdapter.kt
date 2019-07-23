package com.mayank.letsbinge.Movies

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mayank.letsbinge.Movie_card_item
import com.mayank.letsbinge.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.movie_card.view.*

class ListItemAdapter(val list:ArrayList<Movie_card_item>)
    :RecyclerView.Adapter<ListItemAdapter.ListViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ListViewHolder(
            inflater.inflate(
                R.layout.movie_card,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val user = list[position]
        holder.bind(user,position)
    }

    class ListViewHolder (itemview: View):RecyclerView.ViewHolder(itemview) {

        fun bind(user: Movie_card_item, position: Int) {

            with(itemView){
                movie_title.text = user.title
                rating_movie.text ="⭐ ${user.vote_average.toString()}/10"
                Picasso.get().load("https://image.tmdb.org/t/p/original" + user.poster_path).into(movie_poster)
            }
        }
    }
}
