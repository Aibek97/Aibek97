package com.example.washdriver2.ui.auth.login

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.washdriver2.R
import kotlinx.android.synthetic.main.login_fragment.*

class LoginFragment : Fragment(R.layout.login_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        forgetPassword.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_forgetFragment)
        }
        nowRegister.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_newUserFragment)
        }

    }
}