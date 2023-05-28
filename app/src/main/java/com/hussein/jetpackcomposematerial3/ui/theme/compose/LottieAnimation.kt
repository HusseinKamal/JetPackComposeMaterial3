package com.hussein.jetpackcomposematerial3.ui.theme.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.hussein.jetpackcomposematerial3.R

@Composable
fun LottieAnimation(){
    //Download animated image from --> https://lottiefiles.com/
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.lottie))
    var isPlaying by remember{
        mutableStateOf(true)
    }
    val progress by animateLottieCompositionAsState(composition = composition , isPlaying =isPlaying)
     LaunchedEffect(key1 = progress){
         if(progress == 0f)
         {
             isPlaying = true
         }
         else if(progress == 1f){
             isPlaying = false
         }
     }
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        com.airbnb.lottie.compose.LottieAnimation(modifier = Modifier.size(400.dp),
            composition = composition, progress = { progress})
        Button(onClick = { isPlaying = true }) {
            Text(text = "Play Again")
        }
    }
}