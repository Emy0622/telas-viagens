package br.senai.sp.jandira.telas.Repositorio

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.telas.R
import br.senai.sp.jandira.telas.model.Viagem
import java.time.LocalDate

class ViagemRepositorio {

    @Composable
    fun listarTodasAsViagens(): List<Viagem> {

        val londres = Viagem(
            1,
            "Canadá",
            descricao = "O Canadá é um país norte-americano que se estende desde os EUA, no sul, até o Círculo Polar Ártico, no norte.",
            dataChegada = LocalDate.of(2019, 2, 18),
            dataPartida =   LocalDate.of(2019, 2, 21),
            imagem = painterResource(id = R.drawable.canada)
        )

        val paris = Viagem(
            2,
            "Paris",
            descricao = "Paris, a capital da França, é uma importante cidade europeia e um centro mundial de arte, moda, gastronomia e cultura. Sua paisagem urbana do século XIX é cortada por avenidas largas e pelo rio Sena. ",
            dataChegada = LocalDate.of(2019, 2, 20),
            dataPartida =   LocalDate.of(2019, 2, 22),
            imagem = painterResource(id = R.drawable.paris)
        )

        val rio = Viagem(
            3,
            "Rio de Janeiro",
            descricao = "O Rio de Janeiro é uma grande cidade brasileira à beira-mar, famosa pelas praias de Copacabana e Ipanema, pela estátua de 38 metros de altura do Cristo Redentor, no topo do Corcovado, e pelo Pão de Açúcar, um pico de granito com teleféricos até seu cume. ",
            dataChegada = LocalDate.of(2019, 2, 1),
            dataPartida =   LocalDate.of(2019, 2, 29),
            imagem = painterResource(id = R.drawable.rio)
        )


        return listOf(londres, paris, rio)

    }
}