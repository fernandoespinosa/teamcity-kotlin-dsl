package Release.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_1.*

object Release_Producers_Account : BuildType({
    name = "Producers :: Account SOR"

    enablePersonalBuilds = false
    buildNumberPattern = "0.1.%build.counter%"
})
