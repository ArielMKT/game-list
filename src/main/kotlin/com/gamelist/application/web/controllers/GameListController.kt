package com.gamelist.application.web.controllers

import io.ktor.application.ApplicationCall
import io.ktor.http.HttpStatusCode
import io.ktor.response.respond

class GameListController {
    suspend fun games(appCall: ApplicationCall) {
        appCall.respond(HttpStatusCode.OK)
    }
}
