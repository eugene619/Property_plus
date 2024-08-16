package com.example.property.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.property.R
import com.example.property.navigation.ROUT_ADDPRODUCTS
import com.example.property.navigation.ROUT_HOME
import com.example.property.navigation.ROUT_PROPERTY
import com.example.property.navigation.ROUT_VIEWPRODUCT
import com.example.property.ui.theme.DBcardbg

@Composable
fun DashboardScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(
            text = "Property+",
            fontSize = 50.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Magenta
        )

        Spacer(modifier = Modifier.height(20.dp))

        Image(
            painter = painterResource(id = com.example.property.R.drawable.signupicon),
            contentDescription = "signupicon",
            modifier = Modifier.size(150.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Manage your property with ease",
            fontSize = 25.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Magenta
        )

        Spacer(modifier = Modifier.height(15.dp))

        Column {
            //Start of Main Card
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(450.dp)
                    .padding(10.dp),
                shape = RoundedCornerShape(60.dp),
                colors = CardDefaults.cardColors(DBcardbg),
                elevation = CardDefaults.cardElevation(10.dp)
            ){

                //Row1
                Row (modifier = Modifier.padding(20.dp))
                {
                    //Card1
                    Card (
                        modifier = Modifier
                            .width(160.dp)
                            .clickable { navController.navigate(ROUT_HOME) }){
                        Column {
                            Spacer(modifier = Modifier.height(20.dp))

                            Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center)
                            {
                                Image(
                                    modifier = Modifier.size(100.dp),
                                    painter = painterResource(id = R.drawable.db1),
                                    contentDescription = "home")
                            }

                            Spacer(modifier = Modifier.height(20.dp))

                            Text(
                                text = "Home",
                                modifier = Modifier.padding(start = 40.dp),
                                fontSize = 25.sp,
                                fontFamily = FontFamily.SansSerif,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                    //End of Card1

                    Spacer(modifier = Modifier.width(20.dp))

                    //Card2
                    Card (modifier = Modifier
                        .width(160.dp)
                        .clickable { navController.navigate(ROUT_PROPERTY) }){
                        Column {
                            Spacer(modifier = Modifier.height(20.dp))

                            Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center)
                            {
                                Image(
                                    modifier = Modifier.size(100.dp),
                                    painter = painterResource(id = R.drawable.db2),
                                    contentDescription = "home")
                            }

                            Spacer(modifier = Modifier.height(20.dp))

                            Text(
                                text = "Property",
                                modifier = Modifier.padding(start = 40.dp),
                                fontSize = 25.sp,
                                fontFamily = FontFamily.SansSerif,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                    //End of Card2
                }
                //End of Row1

                //Row2
                Row (
                    modifier = Modifier
                        .padding(start = 20.dp, end = 20.dp)
                        .clickable { navController.navigate(ROUT_ADDPRODUCTS) }){
                    //Card1
                    Card (modifier = Modifier.width(160.dp)){
                        Column {
                            Spacer(modifier = Modifier.height(20.dp))

                            Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center)
                            {
                                Image(
                                    modifier = Modifier.size(100.dp),
                                    painter = painterResource(id = R.drawable.db3),
                                    contentDescription = "home")
                            }

                            Spacer(modifier = Modifier.height(20.dp))

                            Text(
                                text = "Add Product",
                                modifier = Modifier.padding(start = 15.dp),
                                fontSize = 25.sp,
                                fontFamily = FontFamily.SansSerif,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                    //End of Card1

                    Spacer(modifier = Modifier.width(20.dp))

                    //Card2
                    Card (
                        modifier = Modifier
                            .width(160.dp)
                            .clickable { navController.navigate(ROUT_VIEWPRODUCT) }){
                        Column {
                            Spacer(modifier = Modifier.height(20.dp))

                            Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center)
                            {
                                Image(
                                    modifier = Modifier.size(100.dp),
                                    painter = painterResource(id = R.drawable.db4),
                                    contentDescription = "home")
                            }

                            Spacer(modifier = Modifier.height(20.dp))

                            Text(
                                text = "View Product",
                                modifier = Modifier.padding(start = 5.dp),
                                fontSize = 25.sp,
                                fontFamily = FontFamily.SansSerif,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                    //End of Card2
                }
                //End of Row2
            }
        }


    }
}

@Composable
@Preview(showBackground = true)
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())
}