package com.mayank.letsbinge.Tv_shows


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mayank.letsbinge.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class Tv_pop_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_tv_pop, container, false)

//        val list = arrayOf("Avengers","awhabhbf","aefbsbjnfjdnsf")
//        val image = arrayOf(
//            R.drawable.endgame,
//            R.drawable.pexels,
//            R.drawable.endgame
//        )
//        val model_list = ArrayList<Item_model>(3)
//        for(i in list.indices)
//        {
//            model_list.add(Item_model(image[i],list[i]))
//        }
//        val adapter = ListItemAdapter(model_list)
//        view.rvTv_pop.layoutManager = LinearLayoutManager(requireContext(),RecyclerView.VERTICAL,false)
//        view.rvTv_pop.adapter = adapter
        return view
    }


}
