package br.com.liga2.fantasy.domain.draft.entity

import br.com.liga2.fantasy.domain.team.entity.Team
import java.time.Year
import java.util.UUID

data class Pick(
    val id: UUID,
    val currentOwner: Team,
    val originalOwner: Team,
    val year: Year,
    val position: Int?,
    val round: Int?,
)
