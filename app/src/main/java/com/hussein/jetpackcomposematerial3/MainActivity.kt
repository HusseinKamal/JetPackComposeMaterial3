package com.hussein.jetpackcomposematerial3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.hussein.jetpackcomposematerial3.ui.theme.JetpackComposeMaterial3Theme
import com.hussein.jetpackcomposematerial3.ui.theme.compose.HorizontalPagerCompose
import com.hussein.jetpackcomposematerial3.ui.theme.compose.LottieAnimation
import com.hussein.jetpackcomposematerial3.ui.theme.compose.ThemeSwitcher

@ExperimentalMaterial3Api
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeMaterial3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Android")
                    //TopBar()
                    //BlurCompose()
                    //DateTimeDialog()

                    /*var darkTheme by remember { mutableStateOf(false) }
                    ThemeSwitcher(darkTheme = darkTheme, onThemeUpdated = { darkTheme = !darkTheme } )*/
                    //LottieAnimation()
                    HorizontalPagerCompose()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeMaterial3Theme {
        Greeting("Android")
    }
}