package br.senai.sp.jandira.telas.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.telas.R

@Composable
fun TelaHome () {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xffF6F6F6)),

        ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        ) {
            Image(painter = painterResource(id = R.drawable.paris),
                contentDescription = "",
                contentScale = ContentScale.Crop
            )


        }
    }
}

@Preview(showSystemUi = true)
@Composable
//pode colocar qualquer nome na funcao
fun PrewiewHome(){
    //chamar a funcao
    TelaHome()
}
