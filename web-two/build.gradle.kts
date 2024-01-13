plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "1.6.20"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    implementation ("org.springframework.boot:spring-boot-starter-web")
    annotationProcessor ("org.springframework.boot:spring-boot-configuration-processor")
    testImplementation ("org.springframework.boot:spring-boot-starter-test")
    implementation("org.springdoc:springdoc-openapi-ui:1.7.0")
    implementation(files("D:\\project\\java\\invoke-starter\\build\\libs\\spring-invoke-starter.jar"))

}

tasks.test {
    useJUnitPlatform()
}