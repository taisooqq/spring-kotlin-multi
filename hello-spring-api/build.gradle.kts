tasks.getByName("bootJar"){
    enabled = true
}

tasks.getByName("jar"){
    enabled = false
}

dependencies {
    implementation(project(":domain"))
    implementation(project(":support:logging"))
    implementation(project(":support:rest-client"))
    implementation(project(":support:kafka"))
    api(project(":storage:db-core"))
    api(project(":storage:redis"))
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.assertj:assertj-core:3.24.2")
}