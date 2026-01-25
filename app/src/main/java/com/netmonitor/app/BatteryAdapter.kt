package com.netmonitor.app

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BatteryAdapter(
    private val items: List<Pair<String, Float>>
) : RecyclerView.Adapter<BatteryAdapter.VH>() {

    class VH(v: View) : RecyclerView.ViewHolder(v) {
        val name: TextView = v.findViewById(R.id.appName)
        val drain: TextView = v.findViewById(R.id.drainValue)
    }

    override fun onCreateViewHolder(p: ViewGroup, t: Int): VH {
        val v = LayoutInflater.from(p.context)
            .inflate(R.layout.item_battery_app, p, false)
        return VH(v)
    }

    override fun onBindViewHolder(h: VH, i: Int) {
        val (name, value) = items[i]
        h.name.text = name
        h.drain.text = "Drain: $value%"

        h.drain.setTextColor(
            when {
                value >= 8f -> Color.RED
                value >= 4f -> Color.YELLOW
                else -> Color.GREEN
            }
        )
    }

    override fun getItemCount() = items.size
}
