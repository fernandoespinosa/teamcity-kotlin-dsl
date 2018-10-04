package Release

import Release.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2018_1.*
import jetbrains.buildServer.configs.kotlin.v2018_1.Project

object Project : Project({
    id("Release")
    name = "Release"

    buildType(Release_Producers_Account_SOR)
})
