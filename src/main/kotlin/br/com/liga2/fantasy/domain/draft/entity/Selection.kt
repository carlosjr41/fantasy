package br.com.liga2.fantasy.domain.draft.entity

import br.com.liga2.fantasy.domain.player.entity.Player
import br.com.liga2.fantasy.domain.team.entity.Team

data class Selection(
    val pick: Pick,
    val team: Team,
    val playerSelected: Player,
    val position: Int,
    val round: Int,
)