package com.o7services.revisiontopics

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * @Author: 017
 * @Date: 20/02/24
 * @Time: 11:29 am
 */
class RecyclerClass(var list : ArrayList<MessageDataClass>) : RecyclerView.Adapter<RecyclerClass.ViewHolder>() {
    class ViewHolder(var views: View): RecyclerView.ViewHolder(views) {
        var tvMessage = views.findViewById<TextView>(R.id.tvMessage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        lateinit var view : View
        if(viewType == 0){
            view = LayoutInflater.from(parent.context).inflate(R.layout.layout_right, parent, false)
        }else{
            view = LayoutInflater.from(parent.context).inflate(R.layout.layout_left, parent, false)

        }
        return ViewHolder(view)
    }


    override fun getItemViewType(position: Int): Int {
//        return if(position%2 == 0)
//            0
//        else 1
//        return super.getItemViewType(position)
        return if(list[position].id == 0){
            0
        }else 1
    }
    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //set values here
        holder.tvMessage.setText(list[position].message)
    }
}