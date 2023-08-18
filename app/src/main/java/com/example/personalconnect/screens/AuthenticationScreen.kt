
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@Composable
fun AuthenticationScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.clickable {
                navController.popBackStack()
                navController.navigate(Graph.MAIN_APP)
            },
            text = "LOGIN",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            modifier = Modifier.clickable {
                navController.navigate(AuthRoute.SignUp.route)
            },
            text = "Sign Up",
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium
        )
        Text(
            modifier = Modifier.clickable {
                navController.navigate(AuthRoute.Forgot.route)
            },
            text = "Forgot Password",
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium
        )
    }
}

