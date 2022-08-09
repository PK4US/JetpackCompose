package com.pk4us.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column() {
                listItem(name = "Степанчук Евгений", prof = "Программист")
                listItem(name = "Степанчук Евгений", prof = "Программист")
                listItem(name = "Степанчук Евгений", prof = "Программист")
                listItem(name = "Степанчук Евгений", prof = "Программист")
                listItem(name = "Степанчук Евгений", prof = "Программист")


            }
        }
    }

    @Composable
    fun listItem(name:String,prof:String){
        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
        ){
            Box(modifier = Modifier.background(Color.Green)){
                Row(modifier = Modifier.background(Color.Red),
                    verticalAlignment = Alignment.CenterVertically) {
                    Image(painter = painterResource(
                        id = R.drawable.ava),
                        contentDescription = "image",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding()
                            .size(64.dp)
                            .clip(CircleShape)
                        )
                    Column(modifier = Modifier.padding(start = 16.dp)
                        .background(Color.Yellow),
                        ) {
                        Text(text = name)
                        Text(text = prof)
                    }
                }
            }
        }
    }
}