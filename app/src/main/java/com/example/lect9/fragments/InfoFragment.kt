package com.example.lect9.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.lect9.R
import org.w3c.dom.Text

class InfoFragment : Fragment(R.layout.fragment_info) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.textView2).text =
            InfoFragmentArgs.fromBundle(requireArguments()).name
    }

}