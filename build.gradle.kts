import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
/*
buildscript {
    dependencies {
        classpath("net.serenity-bdd:serenity-gradle-plugin:2.4.24")
    }
}*/

plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "1.4.32"
    id("io.qameta.allure") version "2.8.1"
    id("com.github.johnrengelman.shadow") version "5.2.0"
}
/*

apply plugin: "net.serenity-bdd.aggregator"
*/

group = "kz.btsdigital"

repositories {
    maven("http://nexus.btsd.kz/repository/maven-central/")
    maven("http://nexus.btsd.kz/repository/maven-releases/")
    maven("http://nexus.btsd.kz/repository/jcenter/")
}

val allureVersion = "2.13.9"
val junitVersion = "5.7.1"

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    test {
        useJUnitPlatform()
    }
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.codeborne:selenide:5.20.4")

    implementation("io.qameta.allure:allure-selenide:${allureVersion}")

    implementation("net.serenity-bdd:serenity-core:2.4.24")
    implementation("net.serenity-bdd:serenity-junit:2.4.24")
    implementation("org.slf4j:slf4j-simple:1.7.30")

    implementation("org.junit.platform:junit-platform-launcher:1.7.2")
    implementation("org.junit.platform:junit-platform-engine:1.7.2")
    implementation("org.junit.jupiter:junit-jupiter-api:${junitVersion}")
    implementation("org.junit.jupiter:junit-jupiter-engine:${junitVersion}")
    implementation("org.junit.jupiter:junit-jupiter-params:${junitVersion}")

    implementation("com.sikulix:sikulixapi:2.0.2")

}

allure {
    autoconfigure = true
    version = "${allureVersion}"

    useJUnit5 {
        version = "${allureVersion}"
    }
}

val shadowJar by tasks.getting(ShadowJar::class) {
    isZip64 = true
    manifest {
        attributes["Main-Class"] = "kz.btsdigital.eotinish_ui_tests.RunnerKt"
    }
    from(sourceSets["test"].output)
}



