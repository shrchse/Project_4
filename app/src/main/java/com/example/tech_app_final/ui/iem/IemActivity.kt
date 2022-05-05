package com.example.tech_app_final.ui.iem

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.tech_app_final.R

class IemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_detail)

        val imageIem : ImageView = findViewById(R.id.image)
        val titleIem : TextView = findViewById(R.id.text_title)
        val mainIem : TextView = findViewById(R.id.text_comment)

        val bundle : Bundle?= intent.extras
        val image = bundle!!.getInt("image")
        val text = bundle.getInt("title")
        val comment = bundle.getInt("text")

        imageIem.setImageResource(image)
        titleIem.setText(text)
        mainIem.setText(comment)


    }
}