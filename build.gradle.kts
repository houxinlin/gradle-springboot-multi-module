plugins {
    id("java")
    id("org.springframework.boot") version "2.7.6"
    id("io.spring.dependency-management") version "1.1.3"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    maven { url =uri ("https://maven.aliyun.com/repository/public/") }
    mavenCentral()
    maven { url =uri("https://repo.spring.io/milestone")}
    maven { url =uri("https://repo.spring.io/snapshot") }
}


subprojects{
    apply(plugin = "org.springframework.boot")
    apply(plugin = "io.spring.dependency-management")
    repositories {
        maven { url =uri ("https://maven.aliyun.com/repository/public/") }
        mavenCentral()
        maven { url =uri("https://repo.spring.io/milestone")}
        maven { url =uri("https://repo.spring.io/snapshot") }
    }

//    dependencies{
//        implementation("org.springdoc:springdoc-openapi-ui:1.7.0")
//
//    }

}
tasks.test {
    useJUnitPlatform()
}