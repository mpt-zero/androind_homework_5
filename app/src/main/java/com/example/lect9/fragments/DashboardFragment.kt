package com.example.lect9.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.lect9.R

class DashboardFragment : Fragment(R.layout.fragment_dashboard) {
    private lateinit var editNameText : EditText
    private lateinit var buttonSend1 : Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.textView).text =
            DashboardFragmentArgs.fromBundle(requireArguments()).amount.toString()
        editNameText = view.findViewById(R.id.for_name)
        buttonSend1 = view.findViewById(R.id.dash_button)
        val navController = Navigation.findNavController(view)
        buttonSend1.setOnClickListener {
            val name = editNameText.text.toString()
            if(name.isEmpty()){
                return@setOnClickListener
            }
            val action = DashboardFragmentDirections.actionDashboardFragmentToInfoFragment(name)
            navController.navigate(action)

        }

    }

}