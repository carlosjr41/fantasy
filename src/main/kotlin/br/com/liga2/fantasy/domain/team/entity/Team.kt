package br.com.liga2.fantasy.domain.team.entity

import br.com.liga2.fantasy.domain.draft.entity.Pick
import java.time.Year
import java.util.UUID

data class Team(
    val id: UUID,
    val name: String,
    val owner: String,
    val mascot: String?,
    val muse: String?,
    val coach: String?,
    val roster: Roster,
    val picks: Map<Year, Pick>,
)
