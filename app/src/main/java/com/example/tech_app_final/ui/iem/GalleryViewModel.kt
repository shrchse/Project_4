package com.example.tech_app_final.ui.iem

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class GalleryViewModel(
    @DrawableRes val imageResourceId: Int,
    @StringRes val stringResourceId: Int,
    @StringRes val text: Int,
)