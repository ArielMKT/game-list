package com.gamelist.application.web.dto

import com.gamelist.domain.entities.Game
import com.gamelist.domain.entities.GameGenre

data class GameRequest(
    val id: String,
    val name: String,
    val genre: GameGenre
) {
    fun toGame() = Game(
        id = id,
        name = name,
        genre = genre
    )
}
