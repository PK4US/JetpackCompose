package com.pk4us.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Row(
                Modifier
                    .background(Color.Gray).fillMaxHeight(0.5f)
                    .fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceEvenly){

                Column(modifier = Modifier
                    .background(Color.Red).fillMaxWidth(0.3f).fillMaxHeight(0.8f),
                    verticalArrangement = Arrangement.SpaceAround,
                    horizontalAlignment = Alignment.CenterHorizontally,

                ) {
                    Text(text = "Hello")
                    Text(text = "dear")
                    Text(text = "friend")
                }

                Column(modifier = Modifier
                    .background(Color.Green).fillMaxHeight(0.5f),
                    verticalArrangement = Arrangement.SpaceAround,
                    horizontalAlignment = Alignment.End,

                    ) {
                    Text(text = "How")
                    Text(text = "are")
                    Text(text = "you")
                }

            }
        }
    }
}