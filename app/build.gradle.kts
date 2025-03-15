plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.noorsoftsolution.chauddagraminsights"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.noorsoftsolution.chauddagraminsights"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation ("com.github.ibrahimsn98:SmoothBottomBar:1.7.9") // Bottom Navigation
    implementation ("com.google.android.material:material:1.9.0")


    implementation ("com.github.denzcoskun:ImageSlideshow:0.1.2") //slider
    implementation ("com.squareup.picasso:picasso:2.8")

    implementation ("com.intuit.sdp:sdp-android:1.1.1") //sdp
    implementation ("com.intuit.ssp:ssp-android:1.1.1")


    implementation ("com.github.bumptech.glide:glide:4.11.0") //Add Library for Image
    annotationProcessor ("com.github.bumptech.glide:compiler:4.11.0")
}