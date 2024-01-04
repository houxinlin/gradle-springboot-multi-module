plugins {
    id("java")
    id("org.springframework.boot") version "2.7.6"
    id("io.spring.dependency-management") version "1.1.3"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
ext {
    set("springCloudVersion", "2023.0.0-RC1")
}
dependencies {
    implementation ("org.springframework.cloud:spring-cloud-starter-circuitbreaker-resilience4j")
    implementation ("org.springframework.cloud:spring-cloud-starter-gateway")
    testImplementation ("org.springframework.boot:spring-boot-starter-test")
    testImplementation ("org.springframework.cloud:spring-cloud-starter-contract-stub-runner")

    implementation ("org.springframework.cloud:spring-cloud-starter-circuitbreaker-reactor-resilience4j")

}
dependencyManagement {
    imports {
        mavenBom("org.springframework.cloud:spring-cloud-dependencies:2021.0.3")
    }
}
tasks.test {
    useJUnitPlatform()
}