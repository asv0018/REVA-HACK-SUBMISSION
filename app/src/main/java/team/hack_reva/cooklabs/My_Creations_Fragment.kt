package team.hack_reva.cooklabs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_my__creations_.*


class My_Creations_Fragment : Fragment() {
    private val posts_list = ArrayList<Posts>()
    lateinit var recyclerView: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_my__creations_, container, false)
        val postsAdapter = PostAdapterMainActivity(posts_list)
        recyclerView = view.findViewById(R.id.recycler_view_creations) as RecyclerView
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(activity)
        recyclerView.layoutManager = layoutManager
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.adapter = postsAdapter
        posts_list.add(Posts("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQey3S6VQ4qIppedXehx8CQYDshaMBwU1UwpQ&usqp=CAU"
            , "https://wallpaperaccess.com/full/271679.jpg" ,
            "This is first lab by neeralatha aunty", "asb/aeg/ase"))
        posts_list.add(Posts("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQey3S6VQ4qIppedXehx8CQYDshaMBwU1UwpQ&usqp=CAU"
            , "https://wallpaperaccess.com/full/271679.jpg" ,
            "This is first lab by neeralatha aunty", "asb/aeg/ase"))
        posts_list.add(Posts("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQey3S6VQ4qIppedXehx8CQYDshaMBwU1UwpQ&usqp=CAU"
            , "https://wallpaperaccess.com/full/271679.jpg" ,
            "This is first lab by neeralatha aunty", "asb/aeg/ase"))
        posts_list.add(Posts("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQey3S6VQ4qIppedXehx8CQYDshaMBwU1UwpQ&usqp=CAU"
            , "https://wallpaperaccess.com/full/271679.jpg" ,
            "This is first lab by neeralatha aunty", "asb/aeg/ase"))
        posts_list.add(Posts("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQey3S6VQ4qIppedXehx8CQYDshaMBwU1UwpQ&usqp=CAU"
            , "https://wallpaperaccess.com/full/271679.jpg" ,
            "This is first lab by neeralatha aunty", "asb/aeg/ase"))
        posts_list.add(Posts("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQey3S6VQ4qIppedXehx8CQYDshaMBwU1UwpQ&usqp=CAU"
            , "https://wallpaperaccess.com/full/271679.jpg" ,
            "This is first lab by neeralatha aunty", "asb/aeg/ase"))
        posts_list.add(Posts("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQey3S6VQ4qIppedXehx8CQYDshaMBwU1UwpQ&usqp=CAU"
            , "https://wallpaperaccess.com/full/271679.jpg" ,
            "This is first lab by neeralatha aunty", "asb/aeg/ase"))
        posts_list.add(Posts("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQey3S6VQ4qIppedXehx8CQYDshaMBwU1UwpQ&usqp=CAU"
            , "https://wallpaperaccess.com/full/271679.jpg" ,
            "This is first lab by neeralatha aunty", "asb/aeg/ase"))
        posts_list.add(Posts("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQey3S6VQ4qIppedXehx8CQYDshaMBwU1UwpQ&usqp=CAU"
            , "https://wallpaperaccess.com/full/271679.jpg" ,
            "This is first lab by neeralatha aunty", "asb/aeg/ase"))
        posts_list.add(Posts("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQey3S6VQ4qIppedXehx8CQYDshaMBwU1UwpQ&usqp=CAU"
            , "https://wallpaperaccess.com/full/271679.jpg" ,
            "This is first lab by neeralatha aunty", "asb/aeg/ase"))
        posts_list.add(Posts("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQey3S6VQ4qIppedXehx8CQYDshaMBwU1UwpQ&usqp=CAU"
            , "https://wallpaperaccess.com/full/271679.jpg" ,
            "This is first lab by neeralatha aunty", "asb/aeg/ase"))
        posts_list.add(Posts("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQey3S6VQ4qIppedXehx8CQYDshaMBwU1UwpQ&usqp=CAU"
            , "https://wallpaperaccess.com/full/271679.jpg" ,
            "This is first lab by neeralatha aunty", "asb/aeg/ase"))
        posts_list.add(Posts("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQey3S6VQ4qIppedXehx8CQYDshaMBwU1UwpQ&usqp=CAU"
            , "https://wallpaperaccess.com/full/271679.jpg" ,
            "This is first lab by neeralatha aunty", "asb/aeg/ase"))
        posts_list.add(Posts("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQey3S6VQ4qIppedXehx8CQYDshaMBwU1UwpQ&usqp=CAU"
            , "https://wallpaperaccess.com/full/271679.jpg" ,
            "This is first lab by neeralatha aunty", "asb/aeg/ase"))

        postsAdapter.notifyDataSetChanged()
        return view
    }


}