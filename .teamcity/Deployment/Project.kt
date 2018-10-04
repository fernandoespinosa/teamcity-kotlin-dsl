package Deployment

import jetbrains.buildServer.configs.kotlin.v2018_1.*
import jetbrains.buildServer.configs.kotlin.v2018_1.Project

object Project : Project({
    id("Deployment")
    name = "Deployment"

    subProject(Deployment_Integration.Project)
    subProject(Deployment_Dev.Project)
})
