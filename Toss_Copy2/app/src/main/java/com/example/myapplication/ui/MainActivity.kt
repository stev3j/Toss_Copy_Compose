package com.example.myapplication.ui

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.ui.navigation.BottomNavBar
import com.example.myapplication.ui.navigation.NavGraph
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background,
    ) {
        val navController = rememberNavController()
        Scaffold(
            bottomBar = { BottomNavBar(navController = navController) }
        ) {
            Box(Modifier.padding(it)){
                NavGraph(navController = navController)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    MyApplicationTheme {
        MyApp()
    }
}