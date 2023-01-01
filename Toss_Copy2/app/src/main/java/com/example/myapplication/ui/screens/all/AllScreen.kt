package com.example.myapplication.ui.screens.all

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun AllScreen() {
    Scaffold(
        topBar = {
//            TopAppBar(
//                backgroundColor = Color.Transparent,
//                elevation = 0.dp,
//                navigationIcon = ,
//                title = { Text(text = "") }
//            ) {
//
//            }
        }
    ){
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(text = "This Screen is AllScreen!!!")
        }
    }
}