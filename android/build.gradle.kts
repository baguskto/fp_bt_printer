group = "com.fperalta.dev.fp_bt_printer"
version = "1.0-SNAPSHOT"

buildscript {
    val kotlinVersion = "2.1.0"
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:8.9.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

apply(plugin = "com.android.library")
apply(plugin = "kotlin-android")

android {
    namespace = "com.fperalta.dev.fp_bt_printer"
    compileSdk = 35

    sourceSets {
        named("main") {
            java.srcDir("src/main/kotlin")
        }
    }
    
    defaultConfig {
        minSdk = 24
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:2.1.0")
} 