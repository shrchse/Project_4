package com.example.tech_app_final.ui.iem

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tech_app_final.R


class IemAdapter(
    private val context: GalleryFragment,
    private val dataset: List<GalleryViewModel>): RecyclerView.Adapter<IemAdapter.IemViewHolder>()
{
    private lateinit var mListener: OnItemClickListener
    class IemViewHolder(view: View, listener: OnItemClickListener) : RecyclerView.ViewHolder(view){
        val imageView: ImageView = view.findViewById(R.id.brand_image)
        val textView: TextView = view.findViewById(R.id.brand_name)

        init {
            itemView.setOnClickListener{
                listener.onItemClick(adapterPosition)
            }
        }
    }

    interface OnItemClickListener{
        fun onItemClick(position: Int)
    }
    fun setOnItemClick(listener: OnItemClickListener){
        mListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_data, parent, false)
        return IemViewHolder(adapterLayout, mListener)
    }

    override fun onBindViewHolder(holder: IemViewHolder, position: Int) {
        val iem = dataset[position]
        holder.imageView.setImageResource(iem.imageResourceId)
        holder.textView.text = context.resources.getString(iem.stringResourceId)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

}