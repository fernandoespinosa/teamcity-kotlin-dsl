package Tests_Integration

import Tests_Integration.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2018_1.*
import jetbrains.buildServer.configs.kotlin.v2018_1.Project

object Project : Project({
    id("Tests_Integration")
    name = "Integration"

    buildType(Deployment_Integration_Tests_Issuance_Account_Finance)
    buildType(Deployment_Integration_Tests_Redemption_Account)
    buildType(Deployment_Integration_Tests_Issuance_Account_Finance_2)
    buildType(Deployment_Integration_Tests_Issuance_Account_Finance_3)
    buildType(Deployment_Integration_Tests_Issuance_Account_Finance_1)
})
