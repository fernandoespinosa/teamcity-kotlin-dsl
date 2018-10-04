package Deployment_Integration.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_1.*

object Deployment_Integration_Consumers_Finance : BuildType({
    name = "Consumers :: Finance SOR"

    enablePersonalBuilds = false
    type = BuildTypeSettings.Type.DEPLOYMENT
})
