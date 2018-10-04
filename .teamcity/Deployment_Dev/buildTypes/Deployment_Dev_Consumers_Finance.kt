package Deployment_Dev.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_1.*

object Deployment_Dev_Consumers_Finance : BuildType({
    name = "Consumers :: Finance SOR"

    enablePersonalBuilds = false
    type = BuildTypeSettings.Type.DEPLOYMENT
})
