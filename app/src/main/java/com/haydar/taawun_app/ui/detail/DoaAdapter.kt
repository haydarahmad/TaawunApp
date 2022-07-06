package com.haydar.taawun_app.ui.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.haydar.taawun_app.data.ResponseDoa
import com.haydar.taawun_app.databinding.RowItemDaftarBinding

class DoaAdapter : RecyclerView.Adapter<DoaAdapter.MyViewHolder>() {
    class MyViewHolder(val binding: RowItemDaftarBinding) : RecyclerView.ViewHolder(binding.root)

    private var listDoa = ArrayList<ResponseDoa>()

    fun setdata(data:List<ResponseDoa>?){
        if (data == null) return
        listDoa.clear()
        listDoa.addAll(data)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
        RowItemDaftarBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.apply {
            tvNamaDoa.text = listDoa[position].doa
        }
    }

    override fun getItemCount() = listDoa.size

}