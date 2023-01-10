package com.example.myapplication.ui.screens.all

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import com.example.myapplication.data.DataProvider

@Composable
fun RecyclerViewContent() {
    val item = remember { DataProvider.AllList }
    LazyColumn(contentPadding = PaddingValues(16.dp, 8.dp)) {
        items(
            items = item,
            itemContent = { PuppyListItem(it) }
        )
    }
}