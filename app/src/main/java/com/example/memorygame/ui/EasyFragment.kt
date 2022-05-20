package com.example.memorygame.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.memorygame.R
import com.example.memorygame.databinding.FragmentEasyBinding


class EasyFragment : Fragment() {

    private lateinit var binding : FragmentEasyBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_easy,
            container,
            false
        )

        val viewModel = ViewModel(requireActivity().application)

        binding.imageview11.setImageResource(viewModel.getEasyRandomImagesList()[0])
        binding.imageview12.setImageResource(viewModel.getEasyRandomImagesList()[1])
        binding.imageview13.setImageResource(viewModel.getEasyRandomImagesList()[2])
        binding.imageview14.setImageResource(viewModel.getEasyRandomImagesList()[3])
        binding.imageview21.setImageResource(viewModel.getEasyRandomImagesList()[4])
        binding.imageview22.setImageResource(viewModel.getEasyRandomImagesList()[5])
        binding.imageview23.setImageResource(viewModel.getEasyRandomImagesList()[6])
        binding.imageview24.setImageResource(viewModel.getEasyRandomImagesList()[7])
        binding.imageview31.setImageResource(viewModel.getEasyRandomImagesList()[8])
        binding.imageview32.setImageResource(viewModel.getEasyRandomImagesList()[9])
        binding.imageview33.setImageResource(viewModel.getEasyRandomImagesList()[10])
        binding.imageview34.setImageResource(viewModel.getEasyRandomImagesList()[11])
        binding.imageview41.setImageResource(viewModel.getEasyRandomImagesList()[12])
        binding.imageview42.setImageResource(viewModel.getEasyRandomImagesList()[13])
        binding.imageview43.setImageResource(viewModel.getEasyRandomImagesList()[14])
        binding.imageview44.setImageResource(viewModel.getEasyRandomImagesList()[15])


        return binding.root
    }



}