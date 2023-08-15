package br.com.liga2.fantasy.domain.player.entity

import br.com.liga2.fantasy.domain.contract.entity.Contract
import br.com.liga2.fantasy.domain.team.entity.NBATeam
import java.util.UUID

data class Player(
    val id: UUID,
    val firstName: String,
    val surName: String,
    val positions: List<Position>,
    val nbaTeam: NBATeam,
    val contract: Contract,
) {
    val name: String
        get() = "$firstName $surName"
}
