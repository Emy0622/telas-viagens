package br.senai.sp.jandira.telas.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.telas.R

@Composable
fun TelaHome(controladorDeNavegacao: NavHostController?) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xffF6F6F6)),

        ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .height(220.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.paris),
                contentDescription = "",
                contentScale = ContentScale.Crop
            )
            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {


                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(130.dp),
                        horizontalAlignment = Alignment.End
                    ) {
                        Surface(
                            modifier = Modifier
                                .width(60.dp)
                                .height(60.dp),
                            shape = RoundedCornerShape(50.dp)
                        )
                        {
                            Image(
                                modifier = Modifier.clickable { controladorDeNavegacao!!.navigate("cadastrar") },
                                painter = painterResource(id = R.drawable.icon),
                                contentDescription = "profile picture"
                            )

                        }
                        Text(
                            text = "Susanna Hoffs",
                            color = Color.White,
                        )
                    }

                    Column(
                        modifier = Modifier
                            .height(100.dp)
                    ) {
                        Row {
                            Icon(
                                imageVector = Icons.Default.Place,
                                contentDescription = "search",
                                tint = Color.White
                            )
                            Text(
                                text = "You're in Paris",
                                color = Color.White,
                                fontSize = 14.sp,
                            )

                        }
                        Text(modifier = Modifier
                            .padding(start = 10.dp),
                            text = "My Trips",
                            color = Color.White,
                            fontSize = 32.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }


        }
        Row(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(
                text = "Categories",
                color = Color(0xFF868181),
                fontSize = 16.sp
            )
        }
        LazyRow(
            modifier = Modifier
                .padding(start = 16.dp)

        ) {
            item() {
                Card(
                    modifier = Modifier.padding(horizontal = 8.dp),
                ) {
                    Column(

                        modifier = Modifier
                            .size(height = 80.dp, width = 100.dp)
                            .background(color = Color(0xffCF06F0))
                            .padding(18.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            modifier = Modifier,
                            imageVector = Icons.Default.Add,
                            contentDescription = "",
                            tint = Color.White
                        )
                        Text(
                            text = stringResource(id = R.string.login),
                            color = Color.White
                        )
                    }
                }
                Card(
                    modifier = Modifier.padding(horizontal = 8.dp),
                ) {
                    Column(

                        modifier = Modifier
                            .size(height = 80.dp, width = 100.dp)
                            .background(color = Color(0xffCF06F0))
                            .padding(18.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            modifier = Modifier,
                            imageVector = Icons.Default.Add,
                            contentDescription = "",
                            tint = Color.White
                        )
                        Text(
                            text = stringResource(id = R.string.login),
                            color = Color.White
                        )
                    }
                }
                Card(
                    modifier = Modifier.padding(horizontal = 8.dp),
                ) {
                    Column(

                        modifier = Modifier
                            .size(height = 80.dp, width = 100.dp)
                            .background(color = Color(0xffCF06F0))
                            .padding(18.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            modifier = Modifier,
                            imageVector = Icons.Default.Add,
                            contentDescription = "",
                            tint = Color.White
                        )
                        Text(
                            text = stringResource(id = R.string.login),
                            color = Color.White
                        )
                    }
                }
                Card(
                    modifier = Modifier.padding(horizontal = 8.dp),
                ) {
                    Column(

                        modifier = Modifier
                            .size(height = 80.dp, width = 100.dp)
                            .background(color = Color(0xffCF06F0))
                            .padding(18.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            modifier = Modifier,
                            imageVector = Icons.Default.Add,
                            contentDescription = "",
                            tint = Color.White
                        )
                        Text(
                            text = stringResource(id = R.string.login),
                            color = Color.White
                        )
                    }
                }
                Card(
                    modifier = Modifier.padding(horizontal = 8.dp),
                ) {
                    Column(

                        modifier = Modifier
                            .size(height = 80.dp, width = 100.dp)
                            .background(color = Color(0xffCF06F0))
                            .padding(18.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            modifier = Modifier,
                            imageVector = Icons.Default.Add,
                            contentDescription = "",
                            tint = Color.White
                        )
                        Text(
                            text = stringResource(id = R.string.login),
                            color = Color.White
                        )
                    }
                }
                Card(
                    modifier = Modifier.padding(horizontal = 8.dp),
                ) {
                    Column(

                        modifier = Modifier
                            .size(height = 80.dp, width = 100.dp)
                            .background(color = Color(0xffCF06F0))
                            .padding(18.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            modifier = Modifier,
                            imageVector = Icons.Default.Add,
                            contentDescription = "",
                            tint = Color.White
                        )
                        Text(
                            text = stringResource(id = R.string.login),
                            color = Color.White
                        )
                    }
                }
                Card(
                    modifier = Modifier.padding(horizontal = 8.dp),
                ) {
                    Column(

                        modifier = Modifier
                            .size(height = 80.dp, width = 100.dp)
                            .background(color = Color(0xffCF06F0))
                            .padding(18.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            modifier = Modifier,
                            imageVector = Icons.Default.Add,
                            contentDescription = "",
                            tint = Color.White
                        )
                        Text(
                            text = stringResource(id = R.string.login),
                            color = Color.White
                        )
                    }
                }
            }
        }


        Column(modifier = Modifier.padding(16.dp)) {

            OutlinedTextField(
                value = "",
                onValueChange = {
                    ""
                },
                modifier = Modifier
                    .fillMaxWidth(),
                placeholder = {
                    Text(
                        text = "Search your destiny",
                        color = Color(0xFFADAAAA)
                    )
                },
                shape = RoundedCornerShape(22.dp),
//              colors = TextFieldDefaults.colors(Color.White),

                colors =
                OutlinedTextFieldDefaults
                    .colors(
                        focusedBorderColor = Color(0xFFFFFFFF),
                        unfocusedBorderColor = Color(0xffFFFFFF),
                        unfocusedContainerColor = Color(0xffFFFFFF),
                    ),

                )

//        Icon() = {
//            IconButton(onClick = { /*TODO*/ }) {
//                Icon(
//                    imageVector = Icons.Default.Search,
//                    contentDescription = "Search your destiny",
//                    tint = Color(0xFFADAAAA)
//                )
//            }
//        }

            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "Past Trips",
                color = Color(0xFF868181),
                fontSize = 16.sp
            )

            Spacer(modifier = Modifier.height(14.dp))

            LazyColumn() {

                items(4) {
                    Card(
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 6.dp
                        ),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White
                        )

                    ) {
                        Column(
                            modifier = Modifier
                                .padding(12.dp)
                        ) {

                            Surface(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(120.dp),
                                shape = RoundedCornerShape(6.dp)
                            )
                            {
                                Image(
                                    painter = painterResource(id = R.drawable.rio),
                                    contentDescription = "",
                                    contentScale = ContentScale.Crop

                                )
                            }

                            Spacer(modifier = Modifier.height(12.dp))
                            Text(
                                text = "Rio de Janeiro, 2019",
                                color = Color(0xFFCF06F0),
                                fontSize = 18.sp
                            )
                            Spacer(modifier = Modifier.height(6.dp))
                            Text(
                                text = "O Rio de Janeiro é uma grande cidade brasileira à beira-mar, famosa pelas praias de Copacabana e Ipanema, pela estátua de 38 metros de altura do Cristo Redentor.",
                                color = Color(0xFF7A7A7A),
                                fontSize = 11.sp,
                                lineHeight = 15.sp
                            )

                            Row(
                                horizontalArrangement = Arrangement.End,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text(
                                    text = "18 Feb - 21 Feb",
                                    color = Color(0xFFCF06F0),
                                    fontSize = 14.sp
                                )
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(15.dp))
                }
            }
        }
    }

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaHomePreview() {
    TelaHome(controladorDeNavegacao = rememberNavController())
}









