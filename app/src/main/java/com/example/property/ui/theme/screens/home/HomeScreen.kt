package com.example.propertyplus.ui.theme.screens.home


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.property.navigation.ROUT_DETAIL


@Composable
fun HomeScreen(navController: NavController){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(id = com.example.property.R.drawable.home),
            contentDescription = "home",
            modifier = Modifier
                .size(300.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )

        Text(
            text = "Property+",
            fontSize = 60.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Magenta
            )

        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "Your better choice",
            fontSize = 30.sp,
            fontFamily = FontFamily.Serif,
            color = Color.Cyan
        )

        Spacer(modifier = Modifier.height(60.dp))

        Button(
            onClick = { navController.navigate(ROUT_DETAIL) },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 20.dp, end = 20.dp),
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            shape = RoundedCornerShape(10.dp)
        )
        {
            Text(
                text = "Get Started",
                color = Color.Cyan,
                fontSize = 20.sp)

        }


    }

}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())

}

