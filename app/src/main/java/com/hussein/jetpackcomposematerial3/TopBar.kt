package com.hussein.jetpackcomposematerial3

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
@ExperimentalMaterial3Api
fun TopBar(){
    val scrollBehavior  = TopAppBarDefaults.pinnedScrollBehavior()
    Scaffold(topBar = {
        TopAppBar(modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
            scrollBehavior=scrollBehavior,
        navigationIcon = {
            IconButton(onClick = {  }) {
                Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu Icon")
            }
        },
            title = {
                Text(text = "Home")
            },
            colors = TopAppBarDefaults.smallTopAppBarColors(
                containerColor = MaterialTheme.colorScheme.surfaceColorAtElevation(3.dp)
            )
         )
        },
        content = {
            CustomList()
        }
    )
}

@Composable
fun CustomList(){
    val number = remember {
        mutableStateListOf(1,3,4,5,6,7,8)
    }
    LazyColumn{
        items(items=number , key = {it.hashCode()}){
            Text(text = "$it" , modifier = Modifier
                .fillMaxSize()
                .padding(all = 24.dp),
            style = TextStyle(fontSize = MaterialTheme.typography.titleLarge.fontSize, fontWeight = FontWeight.Bold)
            )
        }
    }
}