package com.example.tech_app_final.ui.keyboard

import com.example.tech_app_final.R

class KeyboardData {
    fun data():List<KeyboardViewModel>{
        return listOf(
            KeyboardViewModel(R.drawable.brand_ky, R.string.brand_ky),
            KeyboardViewModel(R.drawable.brand_ky1, R.string.brand_ky1),
            KeyboardViewModel(R.drawable.brand_ky2, R.string.brand_ky2),
            KeyboardViewModel(R.drawable.brand_ky3, R.string.brand_ky3),
            KeyboardViewModel(R.drawable.brand_ky4, R.string.brand_ky4),
            KeyboardViewModel(R.drawable.brand_ky5, R.string.brand_ky5),
            KeyboardViewModel(R.drawable.brand_ky6, R.string.brand_ky6),
        )
    }
}