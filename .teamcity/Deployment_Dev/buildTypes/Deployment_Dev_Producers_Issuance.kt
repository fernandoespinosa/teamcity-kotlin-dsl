package Deployment_Dev.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_1.*

object Deployment_Dev_Producers_Issuance : BuildType({
    name = "Producers :: Issuance SOR"

    enablePersonalBuilds = false
    type = BuildTypeSettings.Type.DEPLOYMENT
})
