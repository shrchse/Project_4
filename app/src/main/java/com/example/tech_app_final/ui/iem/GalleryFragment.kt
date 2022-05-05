package com.example.tech_app_final.ui.iem

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.tech_app_final.R
import com.example.tech_app_final.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val iem = IemData().data()
        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_iem)
        val adapter = IemAdapter(this, iem)
        recyclerView?.adapter = adapter
        recyclerView?.setHasFixedSize(true)

        adapter.setOnItemClick(object : IemAdapter.OnItemClickListener{
            override fun onItemClick(position: Int) {
                val intent = Intent (activity, IemActivity::class.java)
                intent.putExtra("image", iem[position].imageResourceId)
                intent.putExtra("title", iem[position].stringResourceId)
                intent.putExtra("text", iem[position].text)
                startActivity(intent)

                //Toast.makeText(requireActivity(), "Click $position", Toast.LENGTH_SHORT).show()
            }
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}