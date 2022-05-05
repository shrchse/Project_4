package com.example.tech_app_final.ui.keyboard

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tech_app_final.R
import com.example.tech_app_final.ui.iem.IemData

class KeyboardAdapter(
    private val context: KeyboardFragment,
    private val dataset: List<KeyboardViewModel>):
    RecyclerView.Adapter<KeyboardAdapter.KeyboardViewHolder>(){

        private val view = IemData()
        class KeyboardViewHolder(view: View):RecyclerView.ViewHolder(view){
            val imageView: ImageView = view.findViewById(R.id.brand_image)
            val textView: TextView = view.findViewById(R.id.brand_name)
        }
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KeyboardViewHolder {
            val adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_data, parent, false)
            return KeyboardViewHolder(adapterLayout)
        }
    override fun onBindViewHolder(holder: KeyboardViewHolder, position: Int) {
        val keyboard = dataset[position]
        holder.imageView.setImageResource(keyboard.imageResourcesKeyboard)
        holder.textView.text = context.resources.getString(keyboard.stringResKeyboard)

        holder.itemView.setOnClickListener{
            view.data()
        }
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

}
