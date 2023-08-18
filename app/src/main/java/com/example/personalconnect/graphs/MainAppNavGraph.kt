import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.compose.NavHost
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
fun NavGraphBuilder.mainAppNavGraph() {//todo should this method really be here
//    navigation(
//        startDestination = BottomBarScreen.Home.route,
//        route = Graph.MAIN_APP
//    ) {
//        createNestedRoutes(navController)
//    }
    composable(route = Graph.MAIN_APP) {
        val navController: NavHostController = rememberNavController()
        Scaffold(
            bottomBar = {
                BottomBar(navController)
            }
        ) { paddingValues ->
            Box(
                modifier = Modifier.padding(paddingValues)
            ) {
                CreateNestedRoutes(navController = navController)
            }
        }
    }

}

@Composable
fun CreateNestedRoutes(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.MAIN_APP,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
//        BottomBar(navController = navController)
        }
        composable(route = BottomBarScreen.Wallet.route) {
//        BottomBar(navController = navController)
            Text(text = "WALLET")
        }
        composable(route = BottomBarScreen.Identities.route) {
//        BottomBar(navController = navController)
            Text(text = "INDENTITY")
        }
    }
}


@Composable
fun BottomBar(navController: NavHostController) {
    val screens = listOf(
        BottomBarScreen.Home,
        BottomBarScreen.Wallet,
        BottomBarScreen.Identities,
    )


    //these 2 lines allow for item to be selected on nav bar when clicked
    //I have no idea why!
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    navBackStackEntry?.destination


            BottomAppBar() {
                screens.forEach { screen ->
                    AddItemToBottomBar(screen, navController)
                }
            }
        }
//    }


@Composable
fun RowScope.AddItemToBottomBar(
    screen: BottomBarScreen,
    navController: NavHostController
) {

//    println("nav controller desination route: " +navController.currentDestination?.route)
    NavigationBarItem(
        label = {
            Text(text = screen.title)
        },
        icon = {
            Icon(
                imageVector = screen.icon,
                contentDescription = "Navigation Icon"
            )
        },
        selected = navController.currentDestination?.hierarchy?.any {
            it.route == screen.route
        } == true,
//        unselectedContentColor = LocalContentColor.current.copy(alpha = ContentAlpha.disabled),
        onClick = {
            navController.navigate(screen.route) {
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true
            }
        }
    )
}

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Home : BottomBarScreen(
        route = "HOME",
        title = "HOME",
        icon = Icons.Default.Home
    )

    object Wallet : BottomBarScreen(
        route = "WALLET",
        title = "WALLET",
        icon = Icons.Default.Person
    )

    object Identities : BottomBarScreen(
        route = "IDENTITIES",
        title = "IDENTITIES",
        icon = Icons.Default.Settings
    )
}




