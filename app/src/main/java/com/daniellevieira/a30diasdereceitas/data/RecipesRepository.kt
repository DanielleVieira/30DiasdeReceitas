package com.daniellevieira.a30diasdereceitas.data

import com.daniellevieira.a30diasdereceitas.R
import com.daniellevieira.a30diasdereceitas.model.Recipe

object RecipesRepository {
    val recipes = listOf<Recipe>(
        Recipe(
            contentRes = R.raw.recipe_1_content,
            labelRes = R.string.recipe_1_label,
            titleRes = R.string.recipe_1_title,
            imageRes = R.drawable.recipe_1
        ),
        Recipe(
            contentRes = R.raw.recipe_2_content,
            labelRes = R.string.recipe_2_label,
            titleRes = R.string.recipe_2_title,
            imageRes = R.drawable.recipe_2
        ),
        Recipe(
            contentRes = R.raw.recipe_3_content,
            labelRes = R.string.recipe_3_label,
            titleRes = R.string.recipe_3_title,
            imageRes = R.drawable.recipe_3
        ),
        Recipe(
            contentRes = R.raw.recipe_4_content,
            labelRes = R.string.recipe_4_label,
            titleRes = R.string.recipe_4_title,
            imageRes = R.drawable.recipe_4
        ),
        Recipe(
            contentRes = R.raw.recipe_5_content,
            labelRes = R.string.recipe_5_label,
            titleRes = R.string.recipe_5_title,
            imageRes = R.drawable.recipe_5
        ),
    )
}