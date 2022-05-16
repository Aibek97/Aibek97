package com.example.washdriver2.ui.auth.first

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.washdriver2.R
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment(R.layout.fragment_first){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        skip.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_loginFragment)
        }
    }


}