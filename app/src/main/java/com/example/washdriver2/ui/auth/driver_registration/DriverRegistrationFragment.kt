package com.example.washdriver2.ui.auth.driver_registration

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.washdriver2.R
import kotlinx.android.synthetic.main.driver_registration_fragment.*

class DriverRegistrationFragment : Fragment(R.layout.driver_registration_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        next.setOnClickListener {
            findNavController().navigate(R.id.action_driverRegistrationFragment_to_numberVerificationFragment)
        }
        i_am_account.setOnClickListener {
            findNavController().navigate(R.id.action_driverRegistrationFragment_to_loginFragment)
        }

    }

}