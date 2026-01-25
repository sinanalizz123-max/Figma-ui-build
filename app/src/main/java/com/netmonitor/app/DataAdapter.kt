package com.netmonitor.app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DataAdapter(
    private val items: List<Pair<String, String>>
) : RecyclerView.Adapter<DataAdapter.VH>() {

    class VH(v: View) : RecyclerView.ViewHolder(v) {
        val name: TextView = v.findViewById(R.id.appName)
        val usage: TextView = v.findViewById(R.id.appUsage)
    }

    override fun onCreateViewHolder(p: ViewGroup, t: Int): VH {
        val v = LayoutInflater.from(p.context)
            .inflate(R.layout.item_data_app, p, false)
        return VH(v)
    }

    override fun onBindViewHolder(h: VH, i: Int) {
        h.name.text = items[i].first
        h.usage.text = items[i].second
    }

    override fun getItemCount() = items.size
}
