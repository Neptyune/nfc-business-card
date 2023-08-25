package com.example.personalconnect

import RootNavigationGraph
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.personalconnect.ui.theme.PersonalConnectTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PersonalConnectTheme {
                // A surface container using the 'background' color from the theme
                RootNavigationGraph(navController = rememberNavController())



            }
        }
    }
}

