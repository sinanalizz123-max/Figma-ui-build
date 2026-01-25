package com.netmonitor.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DataFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val v = inflater.inflate(R.layout.frag_data, container, false)

        val list = v.findViewById<RecyclerView>(R.id.dataList)
        list.layoutManager = LinearLayoutManager(requireContext())
        list.adapter = DataAdapter(
            listOf(
                "Instagram" to "1.42 GB",
                "YouTube" to "980 MB",
                "Chrome" to "512 MB",
                "WhatsApp" to "233 MB"
            )
        )
        return v
    }
}
