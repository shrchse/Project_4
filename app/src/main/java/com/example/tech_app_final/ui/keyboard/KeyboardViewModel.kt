package com.example.tech_app_final.ui.keyboard

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class KeyboardViewModel(
    @DrawableRes val imageResourcesKeyboard: Int,
    @StringRes val stringResKeyboard: Int,
)