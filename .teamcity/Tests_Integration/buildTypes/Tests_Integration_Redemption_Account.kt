package Tests_Integration.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_1.*

object Tests_Integration_Redemption_Account : BuildType({
    name = "Redemption SOR ↭ Account SOR"

    vcs {
        showDependenciesChanges = true
    }
})
