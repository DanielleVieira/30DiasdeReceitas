package com.daniellevieira.a30diasdereceitas.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import com.daniellevieira.a30diasdereceitas.R

val Montserrat = FontFamily(
    Font(R.font.montserrat_regular),
    Font(R.font.montserrat_bold, FontWeight.Bold),
    Font(R.font.montserrat_italic, style = FontStyle.Italic)
)

val LeagueGothic = FontFamily(
    Font(R.font.league_gothic_regular)
)

// Default Material 3 typography values
val baseline = Typography()

val AppTypography = Typography(
    displayLarge = baseline.displayLarge.copy(fontFamily = LeagueGothic),
    displayMedium = baseline.displayMedium.copy(fontFamily = LeagueGothic),
    displaySmall = baseline.displaySmall.copy(fontFamily = LeagueGothic),
    headlineLarge = baseline.headlineLarge.copy(fontFamily = LeagueGothic),
    headlineMedium = baseline.headlineMedium.copy(fontFamily = LeagueGothic),
    headlineSmall = baseline.headlineSmall.copy(fontFamily = LeagueGothic),
    titleLarge = baseline.titleLarge.copy(fontFamily = LeagueGothic),
    titleMedium = baseline.titleMedium.copy(fontFamily = LeagueGothic),
    titleSmall = baseline.titleSmall.copy(fontFamily = LeagueGothic),
    bodyLarge = baseline.bodyLarge.copy(fontFamily = Montserrat),
    bodyMedium = baseline.bodyMedium.copy(fontFamily = Montserrat),
    bodySmall = baseline.bodySmall.copy(fontFamily = Montserrat),
    labelLarge = baseline.labelLarge.copy(fontFamily = Montserrat),
    labelMedium = baseline.labelMedium.copy(fontFamily = Montserrat),
    labelSmall = baseline.labelSmall.copy(fontFamily = Montserrat),
)

