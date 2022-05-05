package com.example.tech_app_final.ui.mouse

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tech_app_final.R

class MouseFragment : Fragment() {

    companion object {
        fun newInstance() = MouseFragment()
    }

    private lateinit var viewModel: MouseViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.mouse_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MouseViewModel::class.java)
        // TODO: Use the ViewModel
    }

}