package Deployment_Integration.buildTypes

import Release.buildTypes.Release_Producers_Account
import jetbrains.buildServer.configs.kotlin.v2018_1.*
import jetbrains.buildServer.configs.kotlin.v2018_1.triggers.vcs

object Deployment_Integration_Producers_Account : BuildType({
    name = "Producers :: Account SOR"

    enablePersonalBuilds = false
    type = BuildTypeSettings.Type.DEPLOYMENT
    buildNumberPattern = "${Release_Producers_Account.depParamRefs.buildNumber}"

    triggers {
        vcs {
            enabled = false
            branchFilter = ""
            watchChangesInDependencies = true
        }
    }

    dependencies {
        snapshot(Deployment_Dev.buildTypes.Deployment_Dev_Producers_Account) {
        }
        snapshot(Tests_Dev.buildTypes.Deployment_Dev_Tests_Producers_Account) {
        }
    }
})
