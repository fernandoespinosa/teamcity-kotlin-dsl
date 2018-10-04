package Deployment_Integration.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_1.*

object Deployment_Integration_Consumers_TransactionHistory : BuildType({
    name = "Consumers :: Transaction History"

    enablePersonalBuilds = false
    type = BuildTypeSettings.Type.DEPLOYMENT
})
