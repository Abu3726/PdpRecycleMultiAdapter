package com.conamobile.pdprecyclemultipleadapter.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.conamobile.pdprecyclemultipleadapter.R
import com.conamobile.pdprecyclemultipleadapter.model.Member2
import java.util.ArrayList

class CustomRecycle1ItemAdapter(var context2: Context, var members2: ArrayList<Member2>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent2: ViewGroup, viewType2: Int): RecyclerView.ViewHolder {
        val view2 =
            LayoutInflater.from(parent2.context).inflate(R.layout.custom_recycle_view, parent2, false)
        return EssentialViewHolder2(view2)
    }

    override fun onBindViewHolder(holder2: RecyclerView.ViewHolder, position2: Int) {
        var item2 = members2[position2]

        if (holder2 is EssentialViewHolder2){
            var tv_title2 = holder2.tv_title2
            var iv_image2 = holder2.iv_image2

            iv_image2.setImageResource(item2.profile2)
            tv_title2.text = item2.fullname2
        }
    }

    override fun getItemCount(): Int {
        return members2.size
    }


}

class EssentialViewHolder2(view2: View) : RecyclerView.ViewHolder(view2) {
    var iv_image2: ImageView
    var tv_title2: TextView

    init {
        iv_image2 = view2.findViewById(R.id.iv_profile2)
        tv_title2 = view2.findViewById(R.id.tv_fullname2)
    }
}