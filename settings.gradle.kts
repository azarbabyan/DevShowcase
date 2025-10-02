pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
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

rootProject.name = "DevShowcase"
include(":app")
include(":core:designsystem")
include(":core:ui")
include(":core:common")
include(":core:network")
include(":core:database")
include(":feature:projects")
include(":feature:projectdetail")
include(":feature:about")
