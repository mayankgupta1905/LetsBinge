package com.mayank.letsbinge.Movies


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.mayank.letsbinge.Movie_card_item_list
import com.mayank.letsbinge.R
import kotlinx.android.synthetic.main.fragment_movies_pop.text
import kotlinx.android.synthetic.main.fragment_movies_pop.view.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class Movies_Pop_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_movies_pop, container, false)

        Movies_Client.service.movies_popular().enqueue(object : Callback<Movie_card_item_list> {
            override fun onFailure(call: Call<Movie_card_item_list>, t: Throwable) {
                text.text="Loading failed!"
                text.text=text.text.toString()+t.cause.toString()
            }

            override fun onResponse(call: Call<Movie_card_item_list>, response: Response<Movie_card_item_list>) {
                activity!!.runOnUiThread {
                    val adapter = ListItemAdapter(response.body()!!.results)
                    view.rvMovies_pop.layoutManager = LinearLayoutManager(requireContext())
                    view.rvMovies_pop.adapter = adapter
                }
            }
        })
        return view
    }


}
