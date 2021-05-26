package com.example.lect9.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.lect9.R

class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var editTextAmount : EditText
    private lateinit var buttonSend : Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        editTextAmount = view.findViewById(R.id.amount_edit_text)
        buttonSend = view.findViewById(R.id.click1)
        val navController = Navigation.findNavController(view)
        buttonSend.setOnClickListener {
            val amountText = editTextAmount.text.toString()

            if(amountText.isEmpty()){
                return@setOnClickListener
            }
            val amount = amountText.toInt()

            val action = HomeFragmentDirections.actionHomeFragmentToDashboardFragment(amount)
            navController.navigate(action)

        }

    }

}