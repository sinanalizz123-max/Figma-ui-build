package com.netmonitor.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment

class DashboardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val v = inflater.inflate(R.layout.frag_dashboard, container, false)

        val anim = AnimationUtils.loadAnimation(requireContext(), R.anim.pulse_soft)
        v.findViewById<View>(R.id.metricRoot)?.startAnimation(anim)

        return v
    }
}
