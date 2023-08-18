
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
fun NavGraphBuilder.authNavGraph(navController: NavHostController) {
    navigation(//build nested navigation
        route = Graph.AUTHENTICATION,
        startDestination = AuthRoute.Login.route
    ) {
        composable(route = AuthRoute.Login.route) {
            AuthenticationScreen(navController)
        }
        composable(route = AuthRoute.SignUp.route) {
            SignUpScreen()
        }
        composable(route = AuthRoute.Forgot.route) {
            ForgotPasswordScreen()
        }
    }
}

sealed class AuthRoute(val route: String) {
    object Login : AuthRoute(route = "LOGIN")
    object SignUp : AuthRoute(route = "SIGN_UP")
    object Forgot : AuthRoute(route = "FORGOT")
}