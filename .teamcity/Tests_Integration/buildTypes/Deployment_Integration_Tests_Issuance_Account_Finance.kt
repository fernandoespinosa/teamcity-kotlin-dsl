package Tests_Integration.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_1.*

object Deployment_Integration_Tests_Issuance_Account_Finance : BuildType({
    name = "Issuance SOR ↭ Account SOR ↭ Finance SOR"

    type = BuildTypeSettings.Type.COMPOSITE

    vcs {
        showDependenciesChanges = true
    }

    dependencies {
        snapshot(Deployment_Integration_Tests_Issuance_Account_Finance_1) {
        }
        snapshot(Deployment_Integration_Tests_Issuance_Account_Finance_2) {
        }
        snapshot(Deployment_Integration_Tests_Issuance_Account_Finance_3) {
        }
    }
})
