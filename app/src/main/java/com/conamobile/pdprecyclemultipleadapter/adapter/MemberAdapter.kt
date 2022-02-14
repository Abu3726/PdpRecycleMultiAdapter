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
import com.conamobile.pdprecyclemultipleadapter.model.Member
import java.util.ArrayList

class MemberAdapter(var context: Context, var members: ArrayList<Member>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    //more
    private val TYPE_AVAILABLE_YES = 0
    private val TYPE_AVAILABLE_NOT = 1

    override fun getItemViewType(position: Int): Int {
        return if (members[position].available){
            TYPE_AVAILABLE_YES
        }else
            TYPE_AVAILABLE_NOT
    }
    //end

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        if (viewType == TYPE_AVAILABLE_YES){
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_member_list, parent, false)
        return EssentialViewHolder(view)
        }

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_member_list_not, parent, false)
        return EssentialViewHolderNot(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var item = members[position]

        if (holder is EssentialViewHolder){
            var tv_title = holder.tv_title
            var iv_image = holder.iv_image

            iv_image.setImageResource(item.profile)
            tv_title.text = item.fullname
        }

        if (holder is EssentialViewHolderNot){
        var recyclerView = holder.recyclerView
        }
    }

    override fun getItemCount(): Int {
        return members.size
    }


}

class EssentialViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    var iv_image: ImageView
    var tv_title: TextView

    init {
        iv_image = view.findViewById(R.id.iv_profile)
        tv_title = view.findViewById(R.id.tv_fullname)
    }
}

class EssentialViewHolderNot(view: View) : RecyclerView.ViewHolder(view) {
    var recyclerView: RecyclerView

    init {
        recyclerView = view.findViewById(R.id.custom_recycle_view)
    }

}