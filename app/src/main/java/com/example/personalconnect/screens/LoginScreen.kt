package com.example.personalconnect.screens

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController

//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun Login2Scree() {
//    OutlinedTextField(
//        value = "hi",
//        maxLines = 1,
//
//        shape = RoundedCornerShape(32),
//        modifier = Modifier.fillMaxWidth(),
//        onValueChange ={it ->
//            viewModel.onEmailChange(it)
//        },
//
//
//
//
//    )
//}
//
//
//@Composable
//fun LogInScreen(
//    modifier: Modifier = Modifier,
//    navController: NavController,
////    viewModel: SignInViewModel = hiltViewModel()
//) {
//    val snackBarHostState = remember { SnackbarHostState() }
//    val coroutineScope = rememberCoroutineScope()
//
////    val email = viewModel.email.collectAsState(initial = "")
////    val password = viewModel.password.collectAsState()
//    Text(text = "ji")
//    OutlinedTextField(
//        label = {
//            Text(text = "hi")
////            Text(
////                text = "Email",
////                color = MaterialTheme.colorScheme.primary,
////                style = MaterialTheme.typography.titleMedium
////            )
//        },
//        maxLines = 1,
//        shape = RoundedCornerShape(32),
//        modifier = modifier.fillMaxWidth(),
//        value = email.value,
//        onValueChange = {
//            viewModel.onEmailChange(it)
//        },
//    )
//    androidx.compose.material.OutlinedTextField(
//        label = {
//            Text(
//                text = "Password",
//                color = MaterialTheme.colorScheme.primary,
//                style = MaterialTheme.typography.titleMedium
//            )
//        },
//        maxLines = 1,
//        shape = RoundedCornerShape(32),
//        modifier = modifier
//            .fillMaxWidth()
//            .padding(top = 12.dp),
//        value = password.value,
//        onValueChange = {
//            viewModel.onPasswordChange(it)
//        },
//    )
//    val localSoftwareKeyboardController = LocalSoftwareKeyboardController.current
//    Button(modifier = modifier
//        .fillMaxWidth()
//        .padding(top = 12.dp),
//        onClick = {
//            localSoftwareKeyboardController?.hide()
//            viewModel.onGoogleSignIn()
//        }) {
//        Text("Sign in with Google")
//    }
//    Button(modifier = modifier
//        .fillMaxWidth()
//        .padding(top = 12.dp),
//        onClick = {
//            localSoftwareKeyboardController?.hide()
//            viewModel.onSignIn()
//            coroutineScope.launch {
//                snackBarHostState.showSnackbar(
//                    message = "Sign in successfully !",
//                    duration = SnackbarDuration.Long
//                )
//            }
//        }) {
//        Text("Sign in")
//    }
//    OutlinedButton(modifier = modifier
//        .fillMaxWidth()
//        .padding(top = 12.dp), onClick = {
//        navController.navigate(SignUpDestination.route)
//    }) {
//        Text("Sign up")
//    }
//
//}
//}