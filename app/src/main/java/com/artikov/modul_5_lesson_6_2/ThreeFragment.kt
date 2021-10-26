package com.artikov.modul_5_lesson_6_2

import UserAdapter.UserOtherAdapterOne
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.fragment_three.view.*
import models.User
import models.User_one

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ThreeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ThreeFragment : Fragment() {
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

    lateinit var userListOne: ArrayList<User_one>
    lateinit var userOtherAdapterOne: UserOtherAdapterOne
    lateinit var rootOne:View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        rootOne =  inflater.inflate(R.layout.fragment_three, container, false)

        userListOne = ArrayList()
        userOtherAdapterOne = UserOtherAdapterOne(this,userListOne)
        rootOne.rv_one.adapter = userOtherAdapterOne


        loadData()

        return rootOne
    }

    private fun loadData() {

            userListOne.add(User_one(R.drawable.yourstory,"Your Story"))
            userListOne.add(User_one(R.drawable.androidprogrammers,"Programmers"))
            userListOne.add(User_one(R.drawable.movies,"Movies"))
            userListOne.add(User_one(R.drawable.comedy,"Comedy"))
            userListOne.add(User_one(R.drawable.cartoons,"Cartoons"))
            userListOne.add(User_one(R.drawable.muslim,"Muslim"))

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ThreeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ThreeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}