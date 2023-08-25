import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.personalconnect.FancyText
import com.example.personalconnect.SignUpViewModel
import kotlinx.coroutines.launch

//@Composable
//fun SignUpScreen(){
//    FancyText(name = AuthRoute.SignUp.route) {}
//}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
fun SignUpScreen(viewModel: SignUpViewModel = hiltViewModel()) {

    val snackBarHostState = remember { SnackbarHostState() }
    val coroutineScope = rememberCoroutineScope()
    

    Column(
        modifier = Modifier
            .padding(20.dp)
    ) {
        Text(text = "signup!")

//        val email = viewModel.email.collectAsState(initial = "")
//        val password = viewModel.password.collectAsState()
//        OutlinedTextField(
//            label = {
//                Text(
//                    text = "Email",
//                    color = MaterialTheme.colorScheme.primary,
//                    style = MaterialTheme.typography.titleMedium
//                )
//            },
//            maxLines = 1,
//            shape = RoundedCornerShape(32),
//            modifier = Modifier.fillMaxWidth(),
//            value = email.value,
//            onValueChange = {
//                viewModel.onEmailChange(it)
//            },
//        )
//        OutlinedTextField(
//            label = {
//                Text(
//                    text = "Password",
//                    color = MaterialTheme.colorScheme.primary,
//                    style = MaterialTheme.typography.titleMedium
//                )
//            },
//            maxLines = 1,
//            shape = RoundedCornerShape(32),
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(top = 12.dp),
//            value = password.value,
//            onValueChange = {
//                viewModel.onPasswordChange(it)
//            },
//        )
//        val localSoftwareKeyboardController = LocalSoftwareKeyboardController.current
//        Button(modifier = Modifier
//            .fillMaxWidth()
//            .padding(top = 12.dp),
//            onClick = {
//                localSoftwareKeyboardController?.hide()
//                viewModel.onSignUp()
//                coroutineScope.launch {
//                    snackBarHostState.showSnackbar(
//                        message = "Create account successfully. Sign in now!",
//                        duration = SnackbarDuration.Long
//                    )
//                }
//            }) {
//            Text("Sign up")
//        }
    }
}