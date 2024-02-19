package com.o7services.revisiontopics

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

/**
 * @Author: 017
 * @Date: 19/02/24
 * @Time: 12:21 pm
 */
class SpinnerAdapter(var arrayList: ArrayList<String>)  : BaseAdapter(){
    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(position: Int): Any {
        return arrayList[position]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var initView = LayoutInflater.from(p2?.context).inflate(R.layout.spinner_item, p2,false)
        var tvTitle = initView.findViewById<TextView>(R.id.tvTitle)
        tvTitle.setText(arrayList[p0])
        return initView
    }
}