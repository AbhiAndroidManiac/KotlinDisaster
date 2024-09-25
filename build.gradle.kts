plugins {
    kotlin("jvm") version "2.0.20"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
tasks.withType<JavaCompile> {
    sourceCompatibility = "22"
    targetCompatibility = "22"
}


dependencies {
    testImplementation(kotlin("test"))
    this.implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.1")
}

tasks.test {
    useJUnitPlatform()
}
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    compilerOptions {
        // Set the JVM target correctly using the Property type
        jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_22)
    }
}
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(22))
    }
}
kotlin {
    jvmToolchain{
        languageVersion.set(JavaLanguageVersion.of(22))
    }
}

application {
    mainClass.set("MainKt")
}