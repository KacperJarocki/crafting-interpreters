/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java application project to get you started.
 * For more details on building Java & JVM projects, please refer to https://docs.gradle.org/8.10.1/userguide/building_java_projects.html in the Gradle documentation.
 */

plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Use JUnit test framework.
    testImplementation(libs.junit)
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

application {
    // Define the main class for the application.
    mainClass = "org.craftinginterpreters.lox.Lox"
}
tasks.register<JavaExec>("generateAst") {
    mainClass.set("org.craftinginterpreters.tool.GenerateAst") // Fully qualified class name
    classpath = sourceSets.main.get().runtimeClasspath
    args = listOf("./src/main/java/org/craftinginterpreters/lox/") // If the task requires arguments, add them here
}

tasks.register<JavaExec>("AstPrinter") {
    mainClass.set("org.craftinginterpreters.lox.AstPrinter") // Fully qualified class name
    classpath = sourceSets.main.get().runtimeClasspath
}

tasks.register<JavaExec>("rpnp") {
    mainClass.set("org.craftinginterpreters.lox.RpnNotationPrinter") // Fully qualified class name
    classpath = sourceSets.main.get().runtimeClasspath
}
