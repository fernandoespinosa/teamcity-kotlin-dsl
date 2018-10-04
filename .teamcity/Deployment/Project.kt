package Deployment

import jetbrains.buildServer.configs.kotlin.v2018_1.*
import jetbrains.buildServer.configs.kotlin.v2018_1.Project

object Project : Project({
    id("Deployment")
    name = "Deployment"

    features {
        feature {
            id = "PROJECT_EXT_311"
            type = "Invitation"
            param("createdByUserId", "17448")
            param("invitationType", "joinProjectInvitation")
            param("secure:token", "credentialsJSON:12a3729c-a7fd-465d-b362-b1c09c373c26")
            param("name", "Join TeamCity TestDrive")
            param("welcomeText", "Fernando Espinosa invites you to join Testing Pipelines project.")
            param("disabled", "false")
            param("groupKey", "TD_DEVS_2972")
            param("multi", "true")
        }
    }

    subProject(Deployment_Integration.Project)
    subProject(Deployment_Dev.Project)
})
