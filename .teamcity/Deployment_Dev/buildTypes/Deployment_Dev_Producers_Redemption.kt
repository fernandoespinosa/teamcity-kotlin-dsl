package Deployment_Dev.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_1.*

object Deployment_Dev_Producers_Redemption : BuildType({
    name = "Producers :: Redemption SOR"

    enablePersonalBuilds = false
    type = BuildTypeSettings.Type.DEPLOYMENT
})
