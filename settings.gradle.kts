rootProject.name = "spring-kotlin"

include(
    "hello-spring-api",
    "support:logging",
    "storage:db-core",
    "storage:redis",
    "domain"
)

pluginManagement {
    val kotlinVersion: String by settings
    val springBootVersion: String by settings
    val springDependencyManagementVersion: String by settings

    resolutionStrategy {
        eachPlugin {
            when(requested.id.id){
                "org.jetbrains.kotlin.jvm", "org.jetbrains.kotlin.plugin.spring" -> useVersion(kotlinVersion)
                "org.jetbrains.kotlin.kapt", "org.jetbrains.kotlin.plugin.jpa" -> useVersion(kotlinVersion)
                "org.springframework.boot" -> useVersion(springBootVersion)
//                "org.asciidoctor.jvm.convert" -> useVersion(asciidoctorConvertVersion)
                "io.spring.dependency-management" -> useVersion(springDependencyManagementVersion)
            }
        }
    }
}