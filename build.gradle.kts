import org.gradle.api.tasks.Delete

// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        jcenter()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:2.3.3")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        jcenter()
    }
}

tasks {
    "clean"(Delete::class) {
        delete(rootProject.buildDir)
    }
}
