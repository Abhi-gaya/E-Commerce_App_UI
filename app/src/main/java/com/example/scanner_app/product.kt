package com.example.scanner_app

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.example.scanner_app.ui.theme.AquaBlue
import com.example.scanner_app.ui.theme.Purple200
import com.example.scanner_app.ui.theme.Shapes
import com.example.scanner_app.ui.theme.Teal200

data class Product(
    var product_image : Painter,
    var color_option : String,
    var name : String,
    var price : String,
    var cut_price : String,
    var discount : String
)
// Write the fun to make the whole section i.e specifications so that we can pass it in the lazy row area
@Composable
fun product1( pro : Product) {
    Card(elevation = 7.dp, shape = RoundedCornerShape(7.dp), modifier = Modifier.padding(5.dp)) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 2.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.Start
        ) {
            Card(shape = RoundedCornerShape(3.dp), modifier = Modifier.padding(top = 5.dp)) {
                Image(
                    painter = pro.product_image, contentDescription = pro.name,
                    Modifier
                        .size(140.dp)
                        .border(
                            width = 0.5.dp,
                            color = Color.LightGray,
                            shape = RoundedCornerShape(3.dp)
                        )
                )
                Box(modifier = Modifier.padding(10.dp)) {
                Card(shape = RoundedCornerShape(5.dp), elevation = 0.dp) {
                    Text(text = pro.discount,
                  modifier = Modifier
                      .background(color = AquaBlue)
                      .padding(horizontal = 6.dp, vertical = 4.dp), style = MaterialTheme.typography.h4)
                }}}

                Text(text = pro.color_option, style = MaterialTheme.typography.h3)
                Text(text = pro.name, style = MaterialTheme.typography.body1)
                Row(horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = pro.cut_price,
                        style = MaterialTheme.typography.subtitle1,
                        textDecoration = TextDecoration.LineThrough
                    )
                    Text(
                        text = pro.price,
                        style = MaterialTheme.typography.h5,
                        modifier = Modifier.padding(4.dp)
                    )
                }
            }
        }
    }
}
