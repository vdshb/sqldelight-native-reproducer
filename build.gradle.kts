plugins {
    kotlin("multiplatform") version "1.9.21"
}

group = "com.example"
version = "0.1-SNAPSHOT"

kotlin {
    jvm {
        jvmToolchain(11)
        compilations.all {
            kotlinOptions.jvmTarget = "11"
        }
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
    }
    linuxX64()

    sourceSets {
        val commonMain by getting {
            dependencies {
                api("app.cash.sqldelight:runtime:2.0.1")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val jvmMain by getting {
            dependencies {
                api("app.cash.sqldelight:sqlite-driver:2.0.1")
            }
        }

        val linuxX64Main by getting {
            dependencies {
                api("app.cash.sqldelight:native-driver:2.0.1")
            }
        }

    }
}
