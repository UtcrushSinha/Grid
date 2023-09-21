package com.example.grid_display.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topics(
    @StringRes val name: Int,
    val availableCourses: Int,
    @DrawableRes val imageRes: Int

)
