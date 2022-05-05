package com.example.tech_app_final.ui.iem

import com.example.tech_app_final.R

class IemData{

    fun data():List<GalleryViewModel>{
        return listOf(
            GalleryViewModel(R.drawable.iem, R.string.brand_iem, R.string.comment_),
            GalleryViewModel(R.drawable.iem1, R.string.brand_iem1, R.string.comment_1),
            GalleryViewModel(R.drawable.iem2, R.string.brand_iem2, R.string.comment_2),
            GalleryViewModel(R.drawable.iem3, R.string.brand_iem3, R.string.comment_3),
            GalleryViewModel(R.drawable.iem4, R.string.brand_iem4, R.string.comment_4),
            GalleryViewModel(R.drawable.iem5, R.string.brand_iem5, R.string.comment_5),
            GalleryViewModel(R.drawable.iem6, R.string.brand_iem6, R.string.comment_6),
        )
    }
}