package com.netmonitor.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.netmonitor.app.databinding.FragDataBinding

class DataFragment : Fragment() {

    private var _binding: FragDataBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragDataBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recycler.layoutManager = LinearLayoutManager(requireContext())
        binding.recycler.adapter = DataAdapter(mockData())
    }

    private fun mockData(): List<AppUsage> = listOf(
        AppUsage("YouTube", "2.3 GB"),
        AppUsage("Chrome", "1.1 GB"),
        AppUsage("Instagram", "820 MB"),
        AppUsage("WhatsApp", "410 MB")
    )

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
