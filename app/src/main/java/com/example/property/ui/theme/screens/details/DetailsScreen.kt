package com.example.property.ui.theme.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.property.R
import com.example.property.navigation.ROUT_DETAIL
import com.example.property.navigation.ROUT_INTENT
import androidx.compose.material3.IconButton as IconButton

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun DetailsScreen(navController: NavController){

    Column (Modifier.fillMaxSize()){

        TopAppBar(
            title = { Text(text = "Property+")},
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.DarkGray),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "menu", tint = Color.White)
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "notification", tint = Color.White)

                }
            }
        )

        Box(modifier = Modifier
            .height(280.dp)
            .fillMaxWidth(),
            contentAlignment = Alignment.Center)
        {
        Image(
            painter = painterResource(id = R.drawable.home ),
            contentDescription = "home",
            modifier = Modifier.fillMaxSize()
        )
        }

        Spacer(modifier = Modifier.height(20.dp))

        var search by remember { mutableStateOf("")}

        //Search Bar
        OutlinedTextField(
            value = search,
            onValueChange = { search = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "Search")},
            placeholder = { Text(text = "What's your location")}
        )

        Spacer(modifier = Modifier.height(20.dp))

        Row (modifier = Modifier
            .padding(start = 20.dp)
            .horizontalScroll(rememberScrollState()))
        {
            //Card1
            Card (){
                Box(modifier = Modifier
                    .height(180.dp)
                    .width(200.dp),
                    contentAlignment = Alignment.Center)
                {
                    val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.property2))
                    val progress by animateLottieCompositionAsState(composition)
                    LottieAnimation(composition, progress,
                        modifier = Modifier.size(300.dp))
                }

            }

        Spacer(modifier = Modifier.width(20.dp))

        Card (){
            Box(modifier = Modifier
                .height(180.dp)
                .width(200.dp),
                contentAlignment = Alignment.Center)
            {
                Image(
                    painter = painterResource(id = R.drawable.img2 ),
                    contentDescription = "home",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }

        }

        Spacer(modifier = Modifier.width(20.dp))

        Card (){
            Box(modifier = Modifier
                .height(180.dp)
                .width(200.dp),
                contentAlignment = Alignment.Center)
            {
                Image(
                    painter = painterResource(id = R.drawable.img3 ),
                    contentDescription = "home",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }

        }

        Spacer(modifier = Modifier.width(20.dp))

        Card (){
            Box(modifier = Modifier
                .height(180.dp)
                .width(200.dp),
                contentAlignment = Alignment.Center)
            {
                Image(
                    painter = painterResource(id = R.drawable.img4 ),
                    contentDescription = "home",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }

        }

        Spacer(modifier = Modifier.width(20.dp))

        Card () {
            Box(
                modifier = Modifier
                    .height(180.dp)
                    .width(200.dp),
                contentAlignment = Alignment.Center
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.img5),
                    contentDescription = "home",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }
        }

        }

        Spacer(modifier = Modifier.height(50.dp))

        Button(
            onClick = { navController.navigate(ROUT_INTENT) },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 20.dp, end = 20.dp),
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            shape = RoundedCornerShape(10.dp)
        )
        {
            Text(
                text = "Continue",
                color = Color.Cyan)

        }


    }


}

@Composable
@Preview(showBackground = true)
fun DetailsScreenPreview(){
    DetailsScreen(rememberNavController())
}