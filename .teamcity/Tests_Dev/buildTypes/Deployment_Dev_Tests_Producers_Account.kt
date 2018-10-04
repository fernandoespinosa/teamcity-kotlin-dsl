package Tests_Dev.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_1.*

object Deployment_Dev_Tests_Producers_Account : BuildType({
    name = "Producers :: Account SOR"

    dependencies {
        snapshot(Deployment_Dev.buildTypes.Deployment_Dev_Producers_Account) {
        }
    }
})
