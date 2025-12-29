package com.daniellevieira.a30diasdereceitas.model

import androidx.annotation.DrawableRes
import androidx.annotation.RawRes
import androidx.annotation.StringRes

data class Recipe(
    @RawRes val contentRes: Int,
    @StringRes val labelRes: Int,
    @StringRes val titleRes: Int,
    @DrawableRes val imageRes: Int,
)