package Tests_Integration.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_1.*

object Tests_Integration_Issuance_Account_Finance : BuildType({
    name = "Issuance SOR ↭ Account SOR ↭ Finance SOR"

    type = BuildTypeSettings.Type.COMPOSITE

    vcs {
        showDependenciesChanges = true
    }

    dependencies {
        snapshot(Tests_Integration_Issuance_Account_Finance_1) {
        }
        snapshot(Tests_Integration_Issuance_Account_Finance_2) {
        }
        snapshot(Tests_Integration_Issuance_Account_Finance_3) {
        }
    }
})
