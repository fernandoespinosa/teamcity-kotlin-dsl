package Deployment_Dev_Tests

import Deployment_Dev_Tests.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2018_1.*
import jetbrains.buildServer.configs.kotlin.v2018_1.Project

object Project : Project({
    id("Deployment_Dev_Tests")
    name = "Tests"

    buildType(Deployment_Dev_Tests_Producers_Account)
})
