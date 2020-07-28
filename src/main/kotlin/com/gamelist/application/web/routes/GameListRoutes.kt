package com.gamelist.application.web.routes

import com.gamelist.application.web.controllers.GameListController
import io.ktor.routing.Routing
import io.ktor.routing.get

fun Routing.gameList(gameListController: GameListController) {
    get(path = "games") { gameListController.games(this.context) }
}
