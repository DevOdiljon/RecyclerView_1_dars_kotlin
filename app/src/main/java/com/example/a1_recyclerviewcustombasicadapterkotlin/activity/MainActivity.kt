package com.example.a1_recyclerviewcustombasicadapterkotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.a1_recyclerviewcustombasicadapterkotlin.R
import com.example.a1_recyclerviewcustombasicadapterkotlin.adapter.CustomAdapter
import com.example.a1_recyclerviewcustombasicadapterkotlin.model.Member
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

        val members = prepareMemberList()
        refreshMember(members)
    }
    private fun initViews() {
        recyclerView.layoutManager = GridLayoutManager(this, 1)
    }

    private fun refreshMember(members: List<Member>) {
        val adapter = CustomAdapter(members)
        recyclerView.adapter = adapter
    }

    private fun prepareMemberList(): List<Member> {
        val members = ArrayList<Member>()

        for (i in 0..30 step 1){
            members.add(Member("Odilbek ${i}", "+998-97-775-17-79"))
        }

        return members
    }
}