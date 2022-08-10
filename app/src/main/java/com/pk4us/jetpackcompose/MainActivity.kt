package com.pk4us.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.ui.Modifier
import com.pk4us.jetpackcompose.ui.theme.Gray100

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyRow(modifier = Modifier.background(Gray100).fillMaxWidth()){ itemsIndexed(
                listOf(ItemRowModel(R.drawable.image1,"Миша"),
                    ItemRowModel(R.drawable.image2,"Егор"),
                    ItemRowModel(R.drawable.image3,"Андрей"),
                    ItemRowModel(R.drawable.image4,"Витя"),
                    ItemRowModel(R.drawable.image5,"Серьгей"),
                    ItemRowModel(R.drawable.image6,"Олег"),)){ _,item -> MyRow(item = item) }
            }
        }
    }
}