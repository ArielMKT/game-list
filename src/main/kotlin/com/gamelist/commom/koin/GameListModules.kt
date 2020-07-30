package com.gamelist.commom.koin

import com.gamelist.application.web.controllers.GameListController
import com.gamelist.domain.services.GameListService
import org.koin.core.module.Module
import org.koin.dsl.module

val gameListModules: Module = module {
    single { GameListController(get()) }
    single { GameListService() }
}
