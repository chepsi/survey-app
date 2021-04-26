// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:4.1.3")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.32")
        classpath ("com.google.gms:google-services:4.3.5")
        classpath ("io.realm:realm-gradle-plugin:10.3.1")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

plugins {
    kotlin("plugin.serialization") version "1.4.0"
}

allprojects {
    repositories {
        google()
        jcenter()
    }

    configurations.all {
        resolutionStrategy {
            val coroutinesVersion = "1.4.3"
            force("org.jetbrains.kotlinx:kotlinx-coroutines-core:${coroutinesVersion}")
            force("org.jetbrains.kotlinx:kotlinx-coroutines-android:${coroutinesVersion}")
            force("org.jetbrains.kotlinx:kotlinx-coroutines-test:${coroutinesVersion}")
        }
    }
}

tasks.register("clean").configure{
    delete("build")
}