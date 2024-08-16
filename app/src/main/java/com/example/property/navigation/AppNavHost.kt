package com.example.property.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.property.ui.theme.details.DetailsScreen
import com.example.property.ui.theme.screens.dashboard.DashboardScreen
import com.example.property.ui.theme.screens.intent.IntentScreen
import com.example.property.ui.theme.screens.login.LoginScreen
import com.example.property.ui.theme.screens.products.AddProductsScreen
import com.example.property.ui.theme.screens.products.ViewProductScreen
import com.example.property.ui.theme.screens.property.PropertyScreen
import com.example.property.ui.theme.screens.signup.SignupScreen
import com.example.property.ui.theme.screens.splash.SplashScreen
import com.example.propertyplus.ui.theme.screens.about.AboutScreen
import com.example.propertyplus.ui.theme.screens.home.HomeScreen



@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = ROUT_SPLASH
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {

        composable(ROUT_HOME) {
            HomeScreen(navController = navController)
        }

        composable(ROUT_DETAIL) {
            DetailsScreen(navController = navController)

        }

        composable(ROUT_ABOUT) {
            AboutScreen(navController = navController)
        }

        composable(ROUT_SPLASH) {
            SplashScreen(navController = navController)
        }

        composable(ROUT_PROPERTY) {
            PropertyScreen(navController = navController)
        }

        composable(ROUT_INTENT) {
            IntentScreen(navController = navController)
        }

        composable(ROUT_SIGNUP) {
            SignupScreen(navController = navController)
        }

        composable(ROUT_LOGIN) {
            LoginScreen(navController = navController)
        }

        composable(ROUT_DASHBOARD) {
            DashboardScreen(navController = navController)
        }

        composable(ROUT_ADDPRODUCTS) {
            AddProductsScreen(navController = navController)
        }

        composable(ROUT_VIEWPRODUCT) {
            ViewProductScreen(navController = navController)
        }
    }

}