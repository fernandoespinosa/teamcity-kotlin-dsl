package Tests

import jetbrains.buildServer.configs.kotlin.v2018_1.*
import jetbrains.buildServer.configs.kotlin.v2018_1.Project

object Project : Project({
    id("Tests")
    name = "Tests"

    subProject(Tests_Integration.Project)
    subProject(Tests_Dev.Project)
})
