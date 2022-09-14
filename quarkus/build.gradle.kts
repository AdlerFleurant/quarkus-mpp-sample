plugins {
    id("io.quarkus") version "2.12.2.Final"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":mpp"))
}