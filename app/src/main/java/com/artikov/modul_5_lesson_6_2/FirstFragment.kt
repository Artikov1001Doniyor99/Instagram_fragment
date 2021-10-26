package com.artikov.modul_5_lesson_6_2

import UserAdapter.UserOtherAdapter
import UserAdapter.UserOtherAdapterOne
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.fragment_first.view.*
import kotlinx.android.synthetic.main.item_user.*
import kotlinx.android.synthetic.main.item_user.view.*
import models.User
import models.User_one

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FirstFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FirstFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    lateinit var userList: ArrayList<User>

    lateinit var userOtherAdapter: UserOtherAdapter

    lateinit var root:View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        root =  inflater.inflate(R.layout.fragment_first, container, false)






        userList = ArrayList()

        userOtherAdapter = UserOtherAdapter(this,userList)

        root.rv.adapter = userOtherAdapter

        loadData()

        // Inflate the layout for this fragment


        return root
    }


    private fun loadData() {

            userList.add(User(R.drawable.uzbekistanone,"Uzbekistan","Uzbekistan,Tashkent",R.drawable.uzbekistantwo,"Likes:100k","Uzbekistan","is an independent",",beautiful and beautiful place.People of different nationalities live there"))

            userList.add(User(R.drawable.lambarghinione,"Lamborghini","Lamborghinir:Sport car",R.drawable.lambarginitwo,"Likes:10k","Lamborghi","is avery fast","powerful and beautiful car"))
            userList.add(User(R.drawable.samsungone,"Samsung","Samsung,South Korea",R.drawable.samsungtwo,"Likes:5k","Samsung","is currently","the best-selling and high-quality phone"))

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FirstFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FirstFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}