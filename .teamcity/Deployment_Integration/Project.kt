package Deployment_Integration

import Deployment_Integration.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2018_1.*
import jetbrains.buildServer.configs.kotlin.v2018_1.Project

object Project : Project({
    id("Deployment_Integration")
    name = "Integration"

    buildType(Deployment_Integration_Producers_Account)
    buildType(Deployment_Integration_Producers_Issuance)
    buildType(Deployment_Integration_Consumers_TransactionHistory)
    buildType(Deployment_Integration_Producers_Redemption)
    buildType(Deployment_Integration_Consumers_Finance)
    buildTypesOrder = arrayListOf(Deployment_Integration_Producers_Issuance, Deployment_Integration_Producers_Redemption, Deployment_Integration_Producers_Account, Deployment_Integration_Consumers_TransactionHistory, Deployment_Integration_Consumers_Finance)
})
