package com.template

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.*
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.template.ui.*
import com.template.ui.theme.Guide_v1Theme
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.launch

@ExperimentalMaterialApi
@OptIn(ExperimentalComposeUiApi::class)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            val scaffoldState = rememberScaffoldState()
            val scope = rememberCoroutineScope()
            var isLockDrawer by remember { mutableStateOf(false) }
            LaunchedEffect(key1 = Unit) {
                navController.addOnDestinationChangedListener { controller, destination, arguments ->
                    isLockDrawer = when (destination.route) {
                        "MenuScreen" -> true
                        else -> false
                    }
                    scope.launch {
                        scaffoldState.drawerState.close()
                    }
                }
            }
            Guide_v1Theme {
                Scaffold(
                    scaffoldState = scaffoldState,
                    drawerGesturesEnabled = !isLockDrawer,
                    drawerContent = {
                        DrawerScreen(navController = navController, onClick = {
                        finish()
                    })
                    },
                    topBar = {
                        ToolBarHost(navController, onMenuClick = {
                            scope.launch {
                                scaffoldState.drawerState.open()
                            }
                        })
                    }
                ) {
                    NavHost(navController = navController, startDestination = "StartScreen") {
                        composable("StartScreen") { StartScreen(navController = navController) }
                        composable(
                            "ChapterScreen/{title}",
                            arguments = listOf(navArgument("title") { type = NavType.IntType })
                        ) { ChapterScreen(navController = navController, title = it.arguments?.getInt("title")) }
                        composable(
                            "ItemScreen/{title}",
                            arguments = listOf(navArgument("title") { type = NavType.IntType })
                        ) { ItemScreen(navController = navController, title = it.arguments?.getInt("title")) }
                    }
                }
            }
        }
    }
}

@ExperimentalComposeUiApi
@ExperimentalMaterialApi
@OptIn(InternalCoroutinesApi::class)
@Composable
private fun ToolBarHost(navController: NavController, onMenuClick: () -> Unit) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    when (currentRoute) {
        "StartScreen" -> ToolBar(onMenuClick = onMenuClick)
        "ChapterScreen/{title}" -> ToolBar(onMenuClick = onMenuClick)
        "ItemScreen/{title}" -> ToolBar(onMenuClick = onMenuClick)
    }
}