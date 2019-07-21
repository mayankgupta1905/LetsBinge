package com.mayank.letsbinge.Movies


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mayank.letsbinge.R
import kotlinx.android.synthetic.main.fragment_movies_ns_.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class Movies_Tr_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {// Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_movies_ns_, container, false)

        val list = arrayOf("Avengers","awhflknwjlfnabhbf","aefbsbjnfjdnsf")
        val image = arrayOf(
            R.drawable.endgame,
            R.drawable.pexels,
            R.drawable.endgame
        )
        val model_list = ArrayList<Item_model>(3)
        for(i in model_list.indices)
        {
            model_list[i].movie_name = list[i]
            model_list[i].image = image[i]
        }
        val adapter = ListItemAdapter(model_list)
        rvMovies.layoutManager = LinearLayoutManager(this.context, RecyclerView.VERTICAL,false)
        rvMovies.adapter = adapter
        return view
    }


}
