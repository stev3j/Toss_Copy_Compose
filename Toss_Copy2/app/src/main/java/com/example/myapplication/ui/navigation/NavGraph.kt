package com.example.myapplication.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myapplication.ui.screens.all.AllScreen
import com.example.myapplication.ui.screens.benefits.BenefitsScreen
import com.example.myapplication.ui.screens.home.HomeScreen
import com.example.myapplication.ui.screens.remit.RemitScreen
import com.example.myapplication.ui.screens.stock.StockScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.Home.screenRoute) {
        composable(Screen.Home.screenRoute) {
            HomeScreen()
        }
        composable(Screen.Benefits.screenRoute) {
            BenefitsScreen()
        }
        composable(Screen.Remit.screenRoute) {
            RemitScreen()
        }
        composable(Screen.Stock.screenRoute) {
            StockScreen()
        }
        composable(Screen.All.screenRoute) {
            AllScreen()
        }
    }
}