package com.netmonitor.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.netmonitor.app.databinding.FragBatteryBinding

class BatteryFragment : Fragment() {

    private var _binding: FragBatteryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragBatteryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recycler.layoutManager = LinearLayoutManager(requireContext())
        binding.recycler.adapter = BatteryAdapter(mockData())
    }

    private fun mockData(): List<BatteryUsage> = listOf(
        BatteryUsage("YouTube", "18%"),
        BatteryUsage("Chrome", "11%"),
        BatteryUsage("Instagram", "9%"),
        BatteryUsage("WhatsApp", "4%")
    )

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
