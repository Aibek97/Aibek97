package com.example.washdriver2.ui.auth.num_verification

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.washdriver2.R
import kotlinx.android.synthetic.main.number_verification_fragment.*

class NumberVerificationFragment : Fragment(R.layout.number_verification_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        next.setOnClickListener {
            findNavController().navigate(R.id.action_numberVerificationFragment_to_fullDriverRegistrationFragment)
        }
    }

}