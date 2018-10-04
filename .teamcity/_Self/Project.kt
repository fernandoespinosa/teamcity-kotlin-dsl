package _Self

import jetbrains.buildServer.configs.kotlin.v2018_1.*
import jetbrains.buildServer.configs.kotlin.v2018_1.Project

object Project : Project({
    subProjectsOrder = arrayListOf(RelativeId("Release"), RelativeId("Deployment"))

    subProject(Release.Project)
    subProject(Deployment.Project)
})
