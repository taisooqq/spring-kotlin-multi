tasks.getByName("bootJar"){
    enabled = true
}

tasks.getByName("jar"){
    enabled = false
}

dependencies {
    implementation(project(":domain"))
    implementation(project(":support:logging"))
    runtimeOnly(project(":storage:db-core"))
    implementation(project(":storage:redis"))
    implementation("org.springframework.boot:spring-boot-starter-web")
}