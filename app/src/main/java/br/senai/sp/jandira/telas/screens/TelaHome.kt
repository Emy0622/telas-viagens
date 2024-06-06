package br.senai.sp.jandira.telas.screens

import android.os.Build
import androidx.annotation.RequiresApi
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
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.BeachAccess
import androidx.compose.material.icons.filled.DownhillSkiing
import androidx.compose.material.icons.filled.Landscape
import androidx.compose.material.icons.filled.LocationOn
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.telas.R
import br.senai.sp.jandira.telas.Repositorio.ViagemRepositorio
import br.senai.sp.jandira.telas.ultilitarios.encurtaDatas

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun TelaHome(controladorDeNavegacao: NavHostController?) {
    val viagens = ViagemRepositorio().listarTodasAsViagens()

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
                            imageVector = Icons.Default.Landscape,
                            contentDescription = "",
                            tint = Color.White
                        )
                        Text(
                            text = stringResource(id = R.string.Montain),
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
                            imageVector = Icons.Default.DownhillSkiing,
                            contentDescription = "",
                            tint = Color.White
                        )
                        Text(
                            text = stringResource(id = R.string.Snow),
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
                            imageVector = Icons.Default.BeachAccess,
                            contentDescription = "",
                            tint = Color.White
                        )
                        Text(
                            text = stringResource(id = R.string.Beach),
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
                            imageVector = Icons.Default.Place,
                            contentDescription = "",
                            tint = Color.White
                        )
                        Text(
                            text = stringResource(id = R.string.Locate),
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
                items(viagens) {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            //.height(250.dp)
                            .padding(horizontal = 20.dp)
                            .padding(top = 10.dp),
                        elevation = CardDefaults.cardElevation(6.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .background(color = Color.White)
                                .fillMaxSize(),
                        ) {
                            Surface(
                                modifier = Modifier
                                    .height(140.dp)
                                    .fillMaxWidth()
                                    .padding(4.dp),
                                RoundedCornerShape(6.dp)
                            ) {
                                Image(
                                    modifier = Modifier,
                                    painter = if (it.imagem == null) painterResource(id = R.drawable.canada) else it.imagem!!,
                                    contentDescription = "",
                                    contentScale = ContentScale.Crop,
                                )
                            }

                            Text(
                                modifier = Modifier
                                    .padding(horizontal = 10.dp, vertical = 2.dp),
                                color = Color(0xffCF06F0),
                                fontSize = 16.sp,
                                text = "${it.destino}, ${it.dataChegada.year}"
                            )
                            Text(
                                modifier = Modifier
                                    .padding(horizontal = 10.dp, vertical = 6.dp),
                                color = Color(0xffA09C9C),
                                fontSize = 12.sp,
                                text = it.descricao
                            )

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(end = 12.dp),
                                horizontalArrangement = Arrangement.End
                            ) {
                                Text(
                                    modifier = Modifier
                                        .padding(vertical = 6.dp),
                                    color = Color(0xffCF06F0),
                                    fontSize = 14.sp,
                                    text = encurtaDatas(it.dataChegada, it.dataPartida),
                                    textAlign = TextAlign.Right
                                )
                            }

                        }
                    }

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









