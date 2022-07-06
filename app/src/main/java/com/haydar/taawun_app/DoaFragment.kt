package com.haydar.taawun_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.haydar.taawun_app.data.ResponseDoa
import com.haydar.taawun_app.databinding.FragmentDoaBinding
import com.haydar.taawun_app.ui.detail.DoaAdapter
import com.haydar.taawun_app.ui.detail.MainViewModel


class DoaFragment : Fragment() {
    private var _binding : FragmentDoaBinding? = null
    private val binding get() = _binding as FragmentDoaBinding
    private var _viewmodel : MainViewModel? = null
    private val viewModel get() = _viewmodel as MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDoaBinding.inflate(layoutInflater)
        viewModel.getdoa()
        viewModel.doaResponse.observe(viewLifecycleOwner){
            setUpDoaRecyclerView(it)
        }
        return binding.root

    }

    private fun setUpDoaRecyclerView(doa: List<ResponseDoa>?) {
     binding.rvNamaDoa.apply {
         val mAdapter = DoaAdapter()
         adapter = mAdapter
         layoutManager = LinearLayoutManager(context)
         mAdapter.setdata(doa)
     }
    }


}

