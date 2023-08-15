package br.com.liga2.fantasy.domain.team.entity

import br.com.liga2.fantasy.domain.player.entity.Player
import java.util.UUID

data class Roster(
    val id: UUID,
    val players: List<Player>
)
