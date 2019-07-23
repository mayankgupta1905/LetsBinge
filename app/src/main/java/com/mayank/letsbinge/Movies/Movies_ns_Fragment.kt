package com.mayank.letsbinge.Movies


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import retrofit2.Callback
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.mayank.letsbinge.Movie_card_item_list
import com.mayank.letsbinge.R
import kotlinx.android.synthetic.main.fragment_movies_ns_.*
import kotlinx.android.synthetic.main.fragment_movies_ns_.view.*
import retrofit2.Call
import retrofit2.Response


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class Movies_ns_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_movies_ns_, container, false)

        Movies_Client.service.movies_now_showing().enqueue(object : Callback<Movie_card_item_list>{
            override fun onFailure(call: Call<Movie_card_item_list>, t: Throwable) {
                text.text="Loading failed!"
                text.text=text.text.toString()+t.cause.toString()
            }

            override fun onResponse(call: Call<Movie_card_item_list>, response: Response<Movie_card_item_list>) {
                activity!!.runOnUiThread {
                    val adapter = ListItemAdapter(response.body()!!.results)
                    view.rvMovies_ns.layoutManager = LinearLayoutManager(requireContext())
                    view.rvMovies_ns.adapter = adapter
                }
            }
        })
        return view
    }

}
