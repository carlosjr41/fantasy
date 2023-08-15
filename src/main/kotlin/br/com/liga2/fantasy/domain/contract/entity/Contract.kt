package br.com.liga2.fantasy.domain.contract.entity

import java.math.BigDecimal
import java.time.LocalDate
import java.util.UUID

data class Contract(
    val id: UUID,
    val valuePerYear: BigDecimal,
    val years: Int,
    val begin: LocalDate,
    val end: LocalDate,
    val restricted: Boolean,
    val birdRights: Boolean,
)
