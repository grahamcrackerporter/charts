plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
}

apply(from = rootProject.file("gradle/configure-android.gradle"))
apply(from = rootProject.file("gradle/configure-compose.gradle"))

dependencies {
    implementation(Kotlin.stdLib)

    implementation(Android.appcompat)
    implementation(Compose.core)
    implementation(Compose.layout)
    implementation(Compose.material)
    implementation(Compose.materialIconsExt)
    implementation(Compose.foundation)
    implementation(Compose.runtime)
    // Previews weren't working when using debugImplementation
    implementation(Compose.tooling)

    implementation(project(":lib:pie"))
    implementation(project(":lib:bar"))
    implementation(project(":lib:line"))

}
