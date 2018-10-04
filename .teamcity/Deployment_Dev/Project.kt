package Deployment_Dev

import Deployment_Dev.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2018_1.*
import jetbrains.buildServer.configs.kotlin.v2018_1.Project

object Project : Project({
    id("Deployment_Dev")
    name = "Dev"

    buildType(Deployment_Dev_Producers_Issuance)
    buildType(Deployment_Dev_Consumers_Finance)
    buildType(Deployment_Dev_Consumers_TransactionHistory)
    buildType(Deployment_Dev_Producers_Redemption)
    buildType(Deployment_Dev_Producers_Account)
    buildTypesOrder = arrayListOf(Deployment_Dev_Producers_Issuance, Deployment_Dev_Producers_Redemption, Deployment_Dev_Producers_Account, Deployment_Dev_Consumers_TransactionHistory, Deployment_Dev_Consumers_Finance)

    subProject(Deployment_Dev_Tests.Project)
})
