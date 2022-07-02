package com.example.scanner_app

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scanner_app.ui.theme.AquaBlue
import com.example.scanner_app.ui.theme.TextWhite

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Home_screen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = TextWhite)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Static_bar()
            Featured_text()
            Products_row(
                products = listOf(
                    Product(
                        product_image = painterResource(id = R.drawable.tshirt_1),
                        color_option = "Red/White/Grey",
                        name = "Solid T-Shirt",
                        price = "$15",
                        cut_price = "$25",
                        discount = "- 40%"
                    ),
                    Product(
                        product_image = painterResource(id = R.drawable.sport_shoes),
                        color_option = "White/Red/Black",
                        name = "Trainers",
                        price = "$50",
                        cut_price = "$65",
                        discount = "- 33%"
                    ),
                    Product(
                        product_image = painterResource(id = R.drawable.chain_nothanged),
                        color_option = "Silver/Gold",
                        name = "Necklace",
                        price = "$5",
                        cut_price = "$10",
                        discount = "- 50%"
                    ),
                    Product(
                        product_image = painterResource(id = R.drawable.color_shoes),
                        color_option = "Colored/White",
                        name = "Sneakers",
                        price = "$55",
                        cut_price = "$70",
                        discount = "- 27%"
                    )
                )
            )
            Athletic_image(discount = "- 37%")
            Category_text()
            Category_grid(
                categories = listOf(
                    Category(
                        image = painterResource(id = R.drawable.white_shoes),
                        name = "Shoes"
                    ),
                    Category(
                        image = painterResource(id = R.drawable.tshirt_1),
                        name = "T-Shirts"
                    ),
                    Category(
                        image = painterResource(id = R.drawable.hoodie),
                        name = "Hoodies"
                    ),
                    Category(
                        image = painterResource(id = R.drawable.lowers),
                        name = "Lowers"
                    ),
                    Category(
                        image = painterResource(id = R.drawable.basketball_shorts),
                        name = "Shorts"
                    ),
                    Category(
                        image = painterResource(id = R.drawable.varsity_jacket),
                        name = "Varsities"
                    ),
                    Category(
                        image = painterResource(id = R.drawable.socks),
                        name = "Socks"
                    ),
                    Category(
                        image = painterResource(id = R.drawable.chain_hanged),
                        name = "Accessories"
                    ),
                    Category(
                        image = painterResource(id = R.drawable.shirt),
                        name = "Shirts"
                    )
                )
            )}
         //   Box(contentAlignment = Alignment.BottomCenter) {
                BottomMenu(
                    items = listOf(
                        BottomMenuContent("Home", R.drawable.home_48px),
                        BottomMenuContent("Category", R.drawable.category_48px),
                        BottomMenuContent("Search", R.drawable.search48px),
                        BottomMenuContent("My Cart", R.drawable.shopping_cart_checkout48px),
                        BottomMenuContent("Profile", R.drawable.person48px),
                    ),modifier = Modifier.align(Alignment.BottomCenter)
                )

        }
    }
//}
@Composable
fun Static_bar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 12.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        // IconButton(onClick = ,Modifier.alpha(ContentAlpha.medium)) {
        Icon(
            painter = painterResource(id = R.drawable.menu_open48px),
            contentDescription = "menu", tint = Color.Black,
            modifier = Modifier
                .padding(start = 8.dp)
                .size(40.dp)
        )
        Icon(
            painter = painterResource(id = R.drawable.notifications_active48px),
            contentDescription = "notifications", tint = Color.Gray,
            modifier = Modifier
                .padding(end = 6.dp)
                .size(37.dp)
        )
    }
}

@Composable
fun Featured_text(){
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(start = 20.dp, end = 20.dp, top = 18.dp, bottom = 12.dp)
        , horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
        Text(text = "Featured Products", style = MaterialTheme.typography.h1)
        Text(text = "See All", style = MaterialTheme.typography.h2, textDecoration = TextDecoration.Underline)
    }
}

@Composable
fun Products_row(products: List<Product>){
    LazyRow(contentPadding = PaddingValues(start = 6.dp, end = 7.5.dp, bottom = 10.dp)){
        items(products.size){
            product1(pro = products[it])
        }
    }
}

@Composable
fun Athletic_image(discount : String) {
    Card(
        modifier = Modifier
            .padding(14.dp)
            .width(1000.dp)
            .height(170.dp),
        shape = RoundedCornerShape(12.dp),
        elevation = 7.dp
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()

        ) {
            Card(shape = RoundedCornerShape(12.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.athletic_masterpiece),
                    contentDescription = "nyc image", modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.BottomStart
            ) {
                Text(
                    text = """Enjoy your personal
  discounts for all
  next purchases
            """.trimMargin(),
                    modifier = Modifier.padding(start = 12.dp, bottom = 12.dp),
                    style = MaterialTheme.typography.h6
                    //    textDecoration = TextDecoration.Underline
                )

            }
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(end = 12.dp, top = 14.dp),
                contentAlignment = Alignment.TopEnd
            ) {
                Card(shape = RoundedCornerShape(5.dp)) {
                    Text(text = discount, style = MaterialTheme.typography.subtitle2,modifier = Modifier.padding(6.dp))
                }
            }
        }
    }
}

@Composable
fun Category_text(){
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(start = 20.dp, end = 20.dp, top = 2.dp, bottom = 1.dp)
        ,horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
        Text(text = "Search by Categories", style = MaterialTheme.typography.h1)
        Text(text = "See All", style = MaterialTheme.typography.h2, textDecoration = TextDecoration.Underline)
    }
}
@ExperimentalFoundationApi
@Composable
fun Category_grid(categories : List<Category>){
    LazyVerticalGrid(cells = GridCells.Fixed(3),modifier=Modifier.padding(top = 5.dp, bottom = 50.dp),
        contentPadding = PaddingValues(vertical = 10.dp, horizontal = 16.dp ),
        content ={
        items(categories.size) {
            Each_Category(tab = categories[it])
        }

    } )
}

@Composable
fun BottomMenu(
    items: List<BottomMenuContent>,
    modifier: Modifier = Modifier,
    activeHighlightColor: Color = AquaBlue,
    activeTextColor: Color = AquaBlue,
    inactiveTextColor: Color = Color.Black,
    initialSelectedItemIndex: Int = 0
) {
    var selectedItemIndex by remember {
        mutableStateOf(initialSelectedItemIndex)
    }
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .background(color = Color.White)
            .padding(3.dp)
    ) {
        items.forEachIndexed { index, item ->
            BottomMenuItem(
                item = item,
                isSelected = index == selectedItemIndex,
                activeHighlightColor = activeHighlightColor,
                activeTextColor = activeTextColor,
                inactiveTextColor = inactiveTextColor
            ) {
                selectedItemIndex = index
            }
        }
    }
}


@Composable
fun BottomMenuItem(
    item: BottomMenuContent,
    isSelected: Boolean = false,
    activeHighlightColor: Color = AquaBlue,
    activeTextColor: Color = Color.White,
    inactiveTextColor: Color = Color.Black,
    onItemClick: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.clickable {
            onItemClick()
        }
    ) {
        Icon(
                painter = painterResource(id = item.iconId),
                contentDescription = item.title,
                tint = if (isSelected) activeTextColor else inactiveTextColor,
                modifier = Modifier.size(25.dp)
            )

        Text(
            text = item.title,
            color = if(isSelected) activeTextColor else inactiveTextColor
        )
    }
}


data class BottomMenuContent(
    val title: String,
    val iconId: Int
)

//function jo call hua hai lazy row mein usme ek box mein column ko call kr uske baad imageview aur baaki ke text view usme daal aur fir pro. krke unko call krlena respective values ko!