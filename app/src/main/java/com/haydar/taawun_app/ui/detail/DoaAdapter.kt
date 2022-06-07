package com.haydar.taawun_app.ui.detail

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.haydar.taawun_app.data.ResponseDoa

class DoaAdapter : RecyclerView.Adapter<DoaAdapter.MyViewHolder>() {
    class MyViewHolder(val binding: ro)

    private var listDoa = ArrayList<ResponseDoa>()

    fun setdata(data:List<ResponseDoa>?){
        if (data == null) return
        listDoa.clear()
        listDoa.addAll(data)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}