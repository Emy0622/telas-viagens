package br.senai.sp.jandira.telas.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.telas.R
import br.senai.sp.jandira.telas.ui.theme.TelasTheme


@Composable
fun TelaLogin(controladorDeNavegacao: NavHostController?) {
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.TopEnd
    ) {
        Box(
            modifier = Modifier
                .background(
                    color = Color(0xffCF06F0),
                    shape = RoundedCornerShape(bottomStart = 18.8.dp)
                )
                .size(height = 40.dp, width = 120.dp)
        )
    }

    // cria uma coluna grande no meio
    Column(
        modifier = Modifier
            .padding(top = 160.dp, start = 10.dp),
    ) {

//Text(text = stringResource(id = R.string.contact_name))

        Text(
            text = stringResource(id = R.string.login),
            color = Color(0xffCF06F0),
            fontSize = 48.sp,
            // fontes
            fontWeight = FontWeight.Bold
        )

        Text(
            text = stringResource(id = R.string.message),
            color = Color(0xffA09C9C),
            fontSize = 21.sp
        )

        //  nova column para alinhar os outlinedTextFields
        Column(
            modifier = Modifier
                // tamanho
                .size(height = 350.dp, width = 500.dp)


                // margem personalizada para poder dar o espaçamento para cima e um pouquinho em baixo pra nao ficar grudado
                .padding(top = 100.dp, end = 10.dp, start = 10.dp)
        ) {

            var emailState = remember {
                mutableStateOf("")
            }

            OutlinedTextField(
                value = emailState.value,
                onValueChange = {
                    emailState.value = it
                },
                modifier = Modifier
                    .size(width = 385.dp, height = 70.dp),
                // borda redonda
                shape = RoundedCornerShape(10.dp),
                label = { Text(text = "E-mail") },
                // acessar a biblioteca de icones do kotlin e usar um
                leadingIcon = {
                    Icon(
                        // icone para email
                        imageVector = Icons.Filled.Email,
                        contentDescription = "",
                        tint = Color(0xffCF06F0)
                    )
                },
                // cores inout
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xffCF06F0),
                    focusedLabelColor = Color(0xffCF06F0),
                    focusedBorderColor = Color(0xffCF06F0)
                )
            )

            var passwordState = remember {
                mutableStateOf("")
            }

            // meesmo processo para todos os outros outlineds que vierem
            OutlinedTextField(
                value = passwordState.value,
                onValueChange = {
                    passwordState.value = it
                },
                modifier = Modifier
                    .padding(top = 10.dp)
                    .size(width = 385.dp, height = 70.dp),
                shape = RoundedCornerShape(10.dp),
                label = {
                    Text(text = stringResource(id = R.string.password))},
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Lock,
                        contentDescription = "",
                        tint = Color(0xffCF06F0)
                    )
                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xffCF06F0),
                    focusedLabelColor = Color(0xffCF06F0),
                    focusedBorderColor = Color(0xffCF06F0)
                )
            )

            // botao
            Button(modifier = Modifier
                .padding(top = 4.dp)
                // alinho onde o botao vai ficar: End, Center, Start, Top, Bottom
                .align(Alignment.End)
                .size(height = 65.dp, width = 160.dp)
                .padding(10.dp),
                shape = RoundedCornerShape(10.dp),
                // acessando as configs personalizadas do button p deixar ele bonitinho
                colors = ButtonDefaults.buttonColors(
                    // container equivale a area do botao
                    containerColor = Color(0xffCF06F0)
                ),
                onClick = { /*TODO*/ }) {

                // text dentro del button
                Text(
                    modifier = Modifier
                        .padding(end = 8.dp),
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 18.sp,
                    text = stringResource(id = R.string.sing_in)
                )

                // iconizinho de seta do lado do text no button
                Icon(
                    imageVector = Icons.Filled.ArrowForward, contentDescription = ""
                )
            }
            // tive que colocar essa row para por os dois texts lado a lado
            Row(
                modifier = Modifier
                    .align(Alignment.End)
                    .padding(end = 10.dp, top = 8.dp)
            ) {
                Text(
                    modifier = Modifier
                        .padding(end = 12.dp),
                    color = Color(0xffA09C9C), text = stringResource(id = R.string.account)
                )
                Text(
                    modifier = Modifier.clickable { controladorDeNavegacao!!.navigate("cadastrar") },
                    color = Color(0xffCF06F0),
                    fontWeight = FontWeight.ExtraBold,
                    text = stringResource(id = R.string.sing_up)
                )
            }
        }
    }

    Box(
        modifier = Modifier
            // box pai, largura da tela
            .fillMaxWidth()

            // box, ficar da altura maxima
            .fillMaxHeight(),

        // alinhamento de todos os itens(filhos) dele pro canto inferior esquerdo
        contentAlignment = Alignment.BottomStart
    ) {
        Box(
            modifier = Modifier

                // define uma cor e ROUNDED CORNER SHAPE para o formato personalizado
                .background(color = Color(0xffCF06F0), shape = RoundedCornerShape(topEnd = 14.8.dp))
                .size(height = 40.dp, width = 120.dp)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    TelasTheme {
        TelaLogin(null)
    }
}
