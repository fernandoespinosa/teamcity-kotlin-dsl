package Tests_Dev

import Tests_Dev.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2018_1.*
import jetbrains.buildServer.configs.kotlin.v2018_1.Project

object Project : Project({
    id("Tests_Dev")
    name = "Dev"

    buildType(Deployment_Dev_Tests_Producers_Account)
})
