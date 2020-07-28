package com.gamelist.commom.koin

import com.gamelist.application.web.controllers.GameListController
import org.koin.core.module.Module
import org.koin.dsl.module

val gameListModules: Module = module {
    single { GameListController() }
}
