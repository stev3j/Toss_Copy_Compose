package com.example.myapplication.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.myapplication.R

sealed class Screen(val title: String, val icon: Int, val screenRoute: String) {
    object Home : Screen("홈", R.drawable.ic_home, HOME)
    object Benefits : Screen("혜택", R.drawable.ic_benefits, BENEFITS)
    object Remit : Screen("송금", R.drawable.ic_remit, REMIT)
    object Stock : Screen("주식", R.drawable.ic_stock, STOCK)
    object All : Screen("전체", R.drawable.ic_all, ALL)
}

const val HOME = "HOME"
const val BENEFITS = "BENEFITS"
const val REMIT = "REMIT"
const val STOCK = "STOCK"
const val ALL = "ALL"
