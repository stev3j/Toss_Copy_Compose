package com.example.myapplication.ui.screens.all

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun AllScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "전체") },
                backgroundColor = Color.White,
                elevation = 0.dp,
                actions = {
                    IconButton( onClick = { /* Todo */ } ){
                        Icon(
//                            imageVector = painterResource(R.drawable.)
                            imageVector = Icons.Default.Search,
                            contentDescription = "Search",
                            tint = Color.LightGray
                        )
                    }
                    IconButton( onClick = { /* Todo */ } ){
                        Icon(
//                            imageVector = painterResource(R.drawable.)
                            imageVector = Icons.Default.Settings,
                            contentDescription = "Settings",
                            tint = Color.LightGray
                        )
                    }
                }
            )
        }
    ){
//        Box(
//            contentAlignment = Alignment.Center,
//            modifier = Modifier.fillMaxSize()
//        ) {
//            Text(text = "This Screen is AllScreen!!!")
//        }
//        RecyclerViewContent()
    }
}