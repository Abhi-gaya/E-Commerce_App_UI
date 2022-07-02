package com.example.scanner_app

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.unit.dp
import com.example.scanner_app.ui.theme.TextWhite

data class Category(
    var image : Painter,
    var name : String
    )

@Composable
fun Each_Category(tab : Category){
    Card(elevation = 10.dp,
         shape = RoundedCornerShape(12.dp),
         modifier =Modifier.padding(5.dp) ) {
      Box(modifier = Modifier
          .fillMaxSize()
          .padding(10.dp)
      ) {
        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
               Image(painter = tab.image, contentDescription =tab.name, modifier = Modifier.size(100.dp))
               Text(text = tab.name, style = MaterialTheme.typography.body1)
        }
   }
}
}











