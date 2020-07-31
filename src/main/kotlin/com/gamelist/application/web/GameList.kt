package com.gamelist.application.web

import com.gamelist.application.web.controllers.GameListController
import com.gamelist.application.web.routes.gameList
import com.gamelist.commom.koin.gameListModules
import io.ktor.application.Application
import io.ktor.application.install
import io.ktor.features.ContentNegotiation
import io.ktor.features.DefaultHeaders
import io.ktor.jackson.jackson
import io.ktor.routing.Routing
import org.koin.ktor.ext.Koin
import org.koin.ktor.ext.inject

fun Application.main() {
    val gameListController: GameListController by inject()

    install(DefaultHeaders)

    install(ContentNegotiation) {
        jackson()
    }

    install(Koin) {
        modules(gameListModules)
    }

    install(Routing) {
        gameList(gameListController)
    }
}
