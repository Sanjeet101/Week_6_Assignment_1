package com.example.week_6_assignment_1.ui.home

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.softuserassignment.adapter.UserAdapter
import com.example.week_6_assignment_1.MainActivity
import com.example.week_6_assignment_1.R

class HomeFragment : Fragment() {

    private lateinit var rView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = layoutInflater.inflate(R.layout.fragment_home, container, false)
        rView = view?.findViewById(R.id.rView) as RecyclerView
        val userAdapter = UserAdapter(MainActivity.UserList, this.activity as Context)
        rView!!.adapter = userAdapter
        rView!!.layoutManager = LinearLayoutManager(this.activity as Context?)
        return view
    }
}