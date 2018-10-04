package Deployment_Integration.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_1.*

object Deployment_Integration_Producers_Redemption : BuildType({
    name = "Producers :: Redemption SOR"

    enablePersonalBuilds = false
    type = BuildTypeSettings.Type.DEPLOYMENT
})
