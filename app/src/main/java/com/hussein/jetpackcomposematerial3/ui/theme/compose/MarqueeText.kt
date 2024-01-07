package com.hussein.jetpackcomposematerial3.ui.theme.compose

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.basicMarquee
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@ExperimentalFoundationApi
@Composable
fun MarqueeText(){
    Text(text = "This is Long Text. This is Long Text. This is Long Text. This is Long Text. This is Long Text. This is Long Text. This is Long Text. This is Long Text.",
        maxLines = 1,
        modifier = Modifier.basicMarquee()
    )

}