package com.example.netclan

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import androidx.annotation.ColorLong
import com.example.netclan.databinding.FragmentPersonalBinding
import com.google.android.material.progressindicator.IndeterminateDrawable


class personal_Fragment : Fragment() {

    var binding:FragmentPersonalBinding?=null

    var progressbar:ProgressBar?=null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentPersonalBinding.inflate(inflater,container,false)

        return binding?.root


        progressbar=binding?.progressBar




    }


}