package com.mayank.letsbinge.Movies

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mayank.letsbinge.R
import kotlinx.android.synthetic.main.movie_card.view.*

class ListItemAdapter(val list:ArrayList<Item_model>)
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
        fun bind(user: Item_model, position: Int) {
            itemView.movie_title.text = user.movie_name
            itemView.movie_poster.setImageResource(user.image)
        }
    }
}
