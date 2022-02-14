package com.conamobile.pdprecyclemultipleadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.conamobile.pdprecyclemultipleadapter.adapter.MemberAdapter
import com.conamobile.pdprecyclemultipleadapter.model.Member
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.recycleView)
        recyclerView?.isScrollContainer = false
        recyclerView?.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        val members: ArrayList<Member> = ArrayList<Member>()
            members.add(Member(R.drawable.cona_image, "Nurmuhammad", true))
            members.add(Member(R.drawable.cona_image, "Nurmuhammad", true))
            members.add(Member(R.drawable.cona_image, "Nurmuhammad",false))
            members.add(Member(R.drawable.cona_image, "Nurmuhammad",true))
            members.add(Member(R.drawable.cona_image, "Nurmuhammad",true))
            members.add(Member(R.drawable.cona_image, "Nurmuhammad",true))
            members.add(Member(R.drawable.cona_image, "Nurmuhammad",true))
            members.add(Member(R.drawable.cona_image, "Nurmuhammad",true))
            members.add(Member(R.drawable.cona_image, "Nurmuhammad",true))
            members.add(Member(R.drawable.cona_image, "Nurmuhammad",true))
            members.add(Member(R.drawable.cona_image, "Nurmuhammad",true))
        refreshAdapter(members)
    }
    private fun refreshAdapter(members: ArrayList<Member>) {
        val adapter = MemberAdapter(this, members)
        recyclerView!!.adapter = adapter
    }
}