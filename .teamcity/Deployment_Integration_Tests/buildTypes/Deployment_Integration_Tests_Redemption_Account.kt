package Deployment_Integration_Tests.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_1.*

object Deployment_Integration_Tests_Redemption_Account : BuildType({
    name = "Redemption SOR ↭ Account SOR"

    vcs {
        showDependenciesChanges = true
    }
})
