package Deployment_Dev.buildTypes

import Release.buildTypes.Release_Producers_Account_SOR
import jetbrains.buildServer.configs.kotlin.v2018_1.*
import jetbrains.buildServer.configs.kotlin.v2018_1.triggers.finishBuildTrigger
import jetbrains.buildServer.configs.kotlin.v2018_1.triggers.vcs

object Deployment_Dev_Producers_Account : BuildType({
    name = "Producers :: Account SOR"

    enablePersonalBuilds = false
    type = BuildTypeSettings.Type.DEPLOYMENT
    buildNumberPattern = "${Release_Producers_Account_SOR.depParamRefs.buildNumber}"

    triggers {
        vcs {
            enabled = false
            branchFilter = ""
            watchChangesInDependencies = true
        }
        finishBuildTrigger {
            buildTypeExtId = "${Release_Producers_Account_SOR.id}"
            successfulOnly = true
        }
    }

    dependencies {
        snapshot(Release.buildTypes.Release_Producers_Account_SOR) {
            onDependencyFailure = FailureAction.FAIL_TO_START
        }
    }
})
