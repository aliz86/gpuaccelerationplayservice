plugins {
    id("com.android.application")
    id("com.google.android.gms.strict-version-matcher-plugin")
}

android {
    namespace = "com.example.tflitegpuacceleration"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.tflitegpuacceleration.accelerationservice"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        all {
            proguardFiles("proguard-rules.pro")
        }
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    aaptOptions {
        noCompress("bin", "tflite")
    }
}

dependencies {
    implementation("com.google.android.gms:play-services-tflite-acceleration-service:16.0.0-beta01")
    implementation("com.google.android.gms:play-services-tflite-java:16.1.0")
    implementation("com.google.android.gms:play-services-tflite-support:16.1.0")
    implementation("com.google.android.gms:play-services-tflite-gpu:16.2.0")
    implementation("com.google.android.gms:play-services-tasks:18.0.2")

    implementation("com.google.errorprone:error_prone_annotations:2.18.0")

    androidTestImplementation("androidx.test:rules:1.1.0")
    androidTestImplementation("androidx.test:runner:1.1.0")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("com.google.truth:truth:1.1.3")
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")
}

// Download default models; if you wish to use your own models then
// place them in the "assets" directory and comment out this line.
project.ext.set("ASSET_DIR", "$projectDir/src/main/assets")
apply(from = "download.gradle")