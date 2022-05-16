package com.example.washdriver2.ui.auth.new_user

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.washdriver2.R
import kotlinx.android.synthetic.main.new_user_fragment.*

class NewUserFragment : Fragment(R.layout.new_user_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        i_driver.setOnClickListener {
            findNavController().navigate(R.id.action_newUserFragment_to_driverRegistrationFragment)
        }
        i_am_driver.setOnClickListener {
            findNavController().navigate(R.id.action_newUserFragment_to_loginFragment)
        }

    }
}