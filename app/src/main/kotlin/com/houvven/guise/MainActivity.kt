package com.houvven.guise

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.view.WindowCompat
import androidx.hilt.navigation.compose.hiltViewModel
import com.houvven.guise.ui.App
import com.houvven.guise.ui.AppViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        enableEdgeToEdge(statusBarStyle = SystemBarStyle.auto(
            darkScrim = Color.TRANSPARENT,
            lightScrim = Color.TRANSPARENT
        ))

        setContent {
            hiltViewModel<AppViewModel>()
            App()
        }
    }
}