package br.com.liga2.fantasy.domain.draft.entity

import java.time.Year

data class Draft(
    val year: Year,
    val selections: List<Selection>

)
