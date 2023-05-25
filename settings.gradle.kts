pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "Playground Compose"
include(":app")
include(":common:composable")
include(":common:theme")
include(":core")
include(":data")
include(":domain")
include(":feature:home")
include(":feature:friends")
include(":feature:inbox")
include(":feature:cameramedia")
include(":feature:myprofile")
include(":feature:authentication")
