package com.example.property.ui.theme.screens.splash

import android.annotation.SuppressLint
import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
import com.example.property.navigation.ROUT_HOME
import com.example.property.ui.theme.mybackgroundcolor
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavController){

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(mybackgroundcolor),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)

    {
        //A code that takes me directly to the HomeScreen
        var coroutineScope = rememberCoroutineScope()
        coroutineScope.launch {
            delay(2000)
            navController.navigate(ROUT_HOME)
        }

        //Lottie Animation
        val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.property1))
        val progress by animateLottieCompositionAsState(composition)
        LottieAnimation(composition, progress,
            modifier = Modifier.size(300.dp)
        )

        /*Image(
            painter = painterResource(id = com.example.property.R.drawable.icon),
            contentDescription = "home",
            modifier = Modifier
                .size(300.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )*/

    }

}

@Composable
@Preview(showBackground = true)
fun SplashScreenPreview(){
    SplashScreen(rememberNavController())
}