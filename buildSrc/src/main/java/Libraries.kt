/**
 *
 * Created by Lukmanul Hakim on  19/05/23
 * devs.lukman@gmail.com
 */

object Libraries {
    object AndroidX {
        const val coreKtx = "androidx.core:core-ktx:${Version.CoreKtx}"
        const val appCompat = "androidx.appcompat:appcompat:${Version.AppCompat}"
        const val lifecycleRunTimeKtx =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Version.LifecycleRunTimeKtx}"
        const val splashScreen = "androidx.core:core-splashscreen:${Version.SplashScreenApi}"
    }

    object Compose {
        const val composeBom = "androidx.compose:compose-bom:${Version.ComposeBom}"
        const val composeUi = "androidx.compose.ui:ui"
        const val composeUiToolingPreview = "androidx.compose.ui:ui-tooling-preview"
        const val composeMaterial3 = "androidx.compose.material3:material3"
        const val composeFoundation = "androidx.compose.foundation:foundation"
        const val composeRuntime = "androidx.compose.runtime:runtime"
        const val composeActivity = "androidx.activity:activity-compose:1.6.1"
        const val composeUiUtil = "androidx.compose.ui:ui-util"
        const val constraintLayoutCompose =
            "androidx.constraintlayout:constraintlayout-compose:${Version.ConstraintLayoutCompose}"
    }

    object Google {
        const val gson = "com.google.code.gson:gson:${Version.GsonVersion}"
        const val guava = "com.google.guava:guava:${Version.GuavaAndroid}"
    }

    object Accompanist {
        const val pager =
            "com.google.accompanist:accompanist-pager:0.29.2-rc"
        const val swiperefresh =
            "com.google.accompanist:accompanist-swiperefresh:${Version.Accompanist}"
        const val indicators =
            "com.google.accompanist:accompanist-pager-indicators:${Version.Accompanist}"
        const val systemuicontroller =
            "com.google.accompanist:accompanist-systemuicontroller:${Version.Accompanist}"
        const val webView = "com.google.accompanist:accompanist-webview:${Version.Accompanist}"
        const val navigationMaterial =
            "com.google.accompanist:accompanist-navigation-material:${Version.Accompanist}"
        const val navigationAnimation =
            "com.google.accompanist:accompanist-navigation-animation:${Version.Accompanist}"
        const val permission =
            "com.google.accompanist:accompanist-permissions:${Version.Accompanist}"
    }

    object Navigation {
        const val navigationCompose =
            "androidx.navigation:navigation-compose:${Version.NavigationCompose}"
    }

    object Coil {
        const val coilCompose = "io.coil-kt:coil-compose:${Version.Coil}"
        const val coilVideo = "io.coil-kt:coil-video:${Version.Coil}"
    }

    object AudioVideo {
        const val exoplayer = "androidx.media3:media3-exoplayer:${Version.Media3}"
        const val expplayerDash = "androidx.media3:media3-exoplayer-dash:${Version.Media3}"
        const val media3Ui = "androidx.media3:media3-ui:${Version.Media3}"
    }

    object Test {
        const val testCoreKtx = "androidx.test:core-ktx:${Version.AndroidXTestVersion}"
        const val espressorCore = "androidx.test.espresso:espresso-core:${Version.EspressoCore}"
        const val junitExtKtx = "androidx.test.ext:junit-ktx:${Version.JunitExtKtx}"
        const val truthExt = "androidx.test.ext:truth:${Version.TruthExt}"
        const val runner = "androidx.test:runner:${Version.TestRunnerVersion}"
    }


    object Hilt {
        const val hiltAndroid = "com.google.dagger:hilt-android:${Version.HiltAndroidVersion}"
        const val hiltCompiler =
            "com.google.dagger:hilt-android-compiler:${Version.HiltAndroidVersion}"
        const val hiltNavigationCompse =
            "androidx.hilt:hilt-navigation-compose:${Version.HiltNavigationCompose}"
    }

    object CameraX {
        const val cameraCore = "androidx.camera:camera-core:${Version.CameraXVersion}"
        const val camera2 = "androidx.camera:camera-camera2:${Version.CameraXVersion}"
        const val cameraLifecycle = "androidx.camera:camera-lifecycle:${Version.CameraXVersion}"
        const val cameraVideo = "androidx.camera:camera-video:${Version.CameraXVersion}"
        const val cameraView = "androidx.camera:camera-view:${Version.CameraXVersion}"
        const val CameraExt = "androidx.camera:camera-extensions:${Version.CameraXVersion}"
    }

}