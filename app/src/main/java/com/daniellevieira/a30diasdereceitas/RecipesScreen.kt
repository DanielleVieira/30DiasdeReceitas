package com.daniellevieira.a30diasdereceitas

import androidx.annotation.RawRes
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.daniellevieira.a30diasdereceitas.model.Recipe
import dev.jeziellago.compose.markdowntext.MarkdownText

@Composable
fun RecipeCard(recipe: Recipe, modifier: Modifier = Modifier) {
    var expanded by remember { mutableStateOf(false) }

    OutlinedCard(
        modifier = modifier
            .animateContentSize()
            .clickable(onClick = { expanded = !expanded }),
        border = BorderStroke(width = 1.dp, color = MaterialTheme.colorScheme.primary)
    ) {
        Column(
            modifier = Modifier
                .padding(dimensionResource(R.dimen.padding_medium))
        ) {
            RecipeCarHeader(recipe)
            RecipeCardImage(
                recipe = recipe,
                modifier = Modifier
                    .height(dimensionResource(R.dimen.recipe_image_height))
                    .fillMaxWidth()
                    .padding(vertical = dimensionResource(R.dimen.padding_small))
            )
            if (expanded) {
                RecipeCardContent(
                    recipe = recipe,
                    modifier = Modifier.padding(top = dimensionResource(R.dimen.padding_small))
                )
            }
            RecipeCarFooter(expanded)

        }
    }
}

@Composable
private fun RecipeCarFooter(expanded: Boolean, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(if (!expanded) R.drawable.arrow_drop_down else R.drawable.arrow_drop_up),
            contentDescription = stringResource(
                if (!expanded) R.string.show_more else R.string.show_less
            )
        )
        Text(
            text = stringResource(if (!expanded) R.string.button_label_more else R.string.button_label_less),
            style = MaterialTheme.typography.labelSmall
        )
    }
}

@Composable
private fun RecipeCardContent(recipe: Recipe, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        MarkdownText(
            markdown = stringFromRawResource(recipe.contentRes),
            style = MaterialTheme.typography.bodySmall,
        )
    }
}

@Composable
private fun RecipeCardImage(recipe: Recipe, modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(recipe.imageRes),
        contentDescription = stringResource(recipe.titleRes),
        contentScale = ContentScale.Crop,
        modifier = modifier
    )
}

@Composable
private fun RecipeCarHeader(recipe: Recipe, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            text = stringResource(recipe.labelRes),
            style = MaterialTheme.typography.labelLarge,
        )
        Text(
            text = stringResource(recipe.titleRes),
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.primary
        )
    }
}

@Composable
private fun stringFromRawResource(@RawRes id: Int): String {
    val context = LocalContext.current
    var content by remember { mutableStateOf("") }
    LaunchedEffect(id) {
        content = context.resources.openRawResource(id).bufferedReader().use { it.readText() }
    }
    return content
}