apply {
    plugin("com.android.application")
}

android {
    compileSdkVersion(25)
    buildToolsVersion("26.0.1")
    defaultConfig {
        applicationId = "com.betweentwobits.kotlindslmultimoduleandroidtest"
        minSdkVersion(21)
        targetSdkVersion(25)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles("proguard-rules.pro")
        }
    }
}

dependencies {
    compile("com.android.support:appcompat-v7:25.3.1")
    compile("com.android.support.constraint:constraint-layout:1.0.2")
}
