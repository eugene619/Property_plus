package com.example.property.ui.theme.screens.signup

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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

@Composable
fun SignupScreen(navController: NavController){

    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Spacer(modifier = Modifier.height(20.dp))

        Image(
            painter = painterResource(id = com.example.property.R.drawable.signupicon),
            contentDescription = "signupicon",
            modifier = Modifier.size(200.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Sign up",
            fontSize = 60.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Magenta
        )

        Spacer(modifier = Modifier.height(20.dp))

        var name by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var confpassword by remember { mutableStateOf("") }

        OutlinedTextField(
            value = name,
            onValueChange = {name = it},
            label = {Text(text = "Fullname")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = {Icon(imageVector = Icons.Default.Person, contentDescription = "")}
        )


    }

}

@Composable
@Preview(showBackground = true)
fun SignupScreenPreview(){
    SignupScreen(rememberNavController())
}