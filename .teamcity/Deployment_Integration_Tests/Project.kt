package Deployment_Integration_Tests

import Deployment_Integration_Tests.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2018_1.*
import jetbrains.buildServer.configs.kotlin.v2018_1.Project

object Project : Project({
    id("Deployment_Integration_Tests")
    name = "Tests"

    buildType(Deployment_Integration_Tests_Issuance_Account_Finance)
    buildType(Deployment_Integration_Tests_Redemption_Account)
    buildType(Deployment_Integration_Tests_Issuance_Account_Finance_2)
    buildType(Deployment_Integration_Tests_Issuance_Account_Finance_3)
    buildType(Deployment_Integration_Tests_Issuance_Account_Finance_1)
    buildTypesOrder = arrayListOf(Deployment_Integration_Tests_Redemption_Account, Deployment_Integration_Tests_Issuance_Account_Finance, Deployment_Integration_Tests_Issuance_Account_Finance_1, Deployment_Integration_Tests_Issuance_Account_Finance_2, Deployment_Integration_Tests_Issuance_Account_Finance_3)
})
