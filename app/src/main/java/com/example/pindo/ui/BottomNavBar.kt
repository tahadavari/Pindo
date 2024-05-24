package com.example.pindo.ui

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.pindo.R

sealed class BottomNavItem(var title: String, var icon: Int, var selectedIcon: Int, var screenRoute: String) {
    object Home : BottomNavItem("Home", R.drawable.ic_home, R.drawable.ic_home_selected, "home")
    object Search : BottomNavItem("Search", R.drawable.ic_search, R.drawable.ic_search, "search")
    object Notifications : BottomNavItem("Notifications", R.drawable.ic_notification, R.drawable.ic_notification, "notifications")
    object Profile : BottomNavItem("Profile", R.drawable.ic_profile, R.drawable.ic_profile, "profile")
}

@Composable
fun BottomNavBar(navController: NavController) {
    val items = listOf(
        BottomNavItem.Home,
        BottomNavItem.Search,
        BottomNavItem.Notifications,
        BottomNavItem.Profile
    )
    NavigationBar(
        contentColor = Color.Black
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        items.forEach { item ->
            NavigationBarItem(
                icon = {
                    val icon = if (currentRoute == item.screenRoute) item.selectedIcon else item.icon
                    Icon(painterResource(id = icon), contentDescription = item.title)
                },
                label = { Text(text = item.title, fontSize = 9.sp) },
                alwaysShowLabel = true,
                selected = currentRoute == item.screenRoute,
                onClick = {
                    navController.navigate(item.screenRoute) {
                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) { saveState = true }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}