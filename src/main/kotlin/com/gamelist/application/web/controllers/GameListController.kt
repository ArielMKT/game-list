package com.gamelist.application.web.controllers

import com.gamelist.application.web.dto.GameRequest
import io.ktor.application.ApplicationCall
import io.ktor.http.HttpStatusCode
import io.ktor.request.receive
import io.ktor.response.respond

class GameListController {
    suspend fun games(appCall: ApplicationCall) {
        appCall.respond(HttpStatusCode.OK)
    }

    suspend fun save(appCall: ApplicationCall) {
        val game = appCall.receive<GameRequest>()
        
        appCall.respond(HttpStatusCode.Created)
    }
}
