package com.netmonitor.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class BatteryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val v = inflater.inflate(R.layout.frag_battery, container, false)

        val list = v.findViewById<RecyclerView>(R.id.batteryList)
        list.layoutManager = LinearLayoutManager(requireContext())
        list.adapter = BatteryAdapter(
            listOf(
                "Instagram" to 8.2f,
                "YouTube" to 6.4f,
                "Chrome" to 3.1f,
                "WhatsApp" to 1.4f
            )
        )
        return v
    }
}
