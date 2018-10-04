package Tests_Integration

import Tests_Integration.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2018_1.*
import jetbrains.buildServer.configs.kotlin.v2018_1.Project

object Project : Project({
    id("Tests_Integration")
    name = "Integration"

    buildType(Deployment_Integration_Tests_Redemption_Account)
    buildType(Tests_Integration_Issuance_Account_Finance)
    buildType(Tests_Integration_Issuance_Account_Finance_2)
    buildType(Tests_Integration_Issuance_Account_Finance_3)
    buildType(Tests_Integration_Issuance_Account_Finance_1)
    buildTypesOrder = arrayListOf(Deployment_Integration_Tests_Redemption_Account, Tests_Integration_Issuance_Account_Finance, Tests_Integration_Issuance_Account_Finance_1, Tests_Integration_Issuance_Account_Finance_2, Tests_Integration_Issuance_Account_Finance_3)
})
