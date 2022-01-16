package com.example.a1_recyclerviewcustombasicadapterkotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.a1_recyclerviewcustombasicadapterkotlin.R
import com.example.a1_recyclerviewcustombasicadapterkotlin.model.Member

class CustomAdapter(private var members: List<Member>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int {
        return members.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_layout_activity_view, parent, false)
        return CustomvViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val member: Member = members[position]
        if (holder is CustomvViewHolder) {
           holder.tv_name.setText(member.firstName)
            holder.tv_tel_number.setText(member.lastName)
        }
    }

    inner class CustomvViewHolder internal constructor(private val view: View) :
        RecyclerView.ViewHolder(
            view
        ) {
        val tv_name: TextView
        val tv_tel_number: TextView

        init {
            tv_name = view.findViewById(R.id.tv_Name)
            tv_tel_number = view.findViewById(R.id.tv_tel_number)
        }
    }

}
