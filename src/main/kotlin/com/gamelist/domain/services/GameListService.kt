package com.gamelist.domain.services

import com.gamelist.domain.entities.Game

class GameListService {

    private val gameList = mutableListOf<Game>()

    fun save(game: Game) {
        gameList.find {
            it.id == game.id
                    && (it.name == game.name)
        }.also {
            if (it == null)
                gameList.add(game)
        }
    }

    fun games() = gameList.toList()
}
