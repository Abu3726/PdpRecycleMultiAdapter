package com.conamobile.pdprecyclemultipleadapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.conamobile.pdprecyclemultipleadapter.adapter.CustomRecycle1ItemAdapter
import com.conamobile.pdprecyclemultipleadapter.model.Member2
import java.util.ArrayList

var recyclerView2: RecyclerView? = null

class CustomRecycleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_member_list_not)
        initViews()
    }

    private fun initViews() {
        recyclerView2 = findViewById(R.id.custom_recycle_view)

        val members2: ArrayList<Member2> = ArrayList<Member2>()
        for (i in 0..30){
            members2.add(Member2(R.drawable.ic_launcher_background, "????????????"))
            members2.add(Member2(R.drawable.cona_image, "???????"))
            members2.add(Member2(R.drawable.cona_image, "Nurmuhammad"))
            members2.add(Member2(R.drawable.cona_image, "Nurmuhammad"))
            members2.add(Member2(R.drawable.cona_image, "Nurmuhammad"))
        }
        refreshAdapter(members2)
    }

    private fun refreshAdapter(members2: ArrayList<Member2>) {
        val adapter2 = CustomRecycle1ItemAdapter(this, members2)
        recyclerView2!!.adapter = adapter2
    }
}