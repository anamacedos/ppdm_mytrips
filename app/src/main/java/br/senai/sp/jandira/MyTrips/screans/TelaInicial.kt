package br.senai.sp.jandira.MyTrips.screans

import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.MyTrips.R
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment


@Composable
fun TelaInicial (modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color.White
            ),
        contentAlignment = Alignment.CenterStart
    ){
        Card (
            modifier = Modifier
                .height(35.dp)
                .width(110.dp)
                .align(Alignment.TopEnd),
            shape = RoundedCornerShape(
                topEnd = 12.dp,
                bottomStart = 12.dp,
                ),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFF7C0B0B)
            )
        ){

        }
        Card (
            modifier = Modifier
                .height(35.dp)
                .width(110.dp)
                .align(Alignment.BottomStart),
            shape = RoundedCornerShape(
                topEnd = 12.dp,
                bottomStart = 12.dp,
                ),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFF7C0B0B)
            )

        ){

        }

        Column(
            modifier = Modifier
                .padding(20.dp)
        ) { //colocar as 2 caixinhas nos cantos


            Column () { //2 textos
                Text(
                    text = stringResource(R.string.login),
                    color = Color(0xFF7C0B0B),
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = stringResource(R.string.text_login),
                    color = Color.Gray,
                    fontSize = 15.sp
                )

            }
            Column(
                modifier = Modifier
                    .padding(top = 65.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                //2 campos de inserir as informações e botoes
                //campo para inserir o email
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .fillMaxWidth(),
                    label = {
                        Text(
                            text = stringResource(R.string.email),
                            color = Color.Gray)
                    },

                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Email,
                            contentDescription = ""
                        )


                    }
                )

                //campo para inserir a senha
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp, bottom = 16.dp),
                    label = {
                        Text(
                            text = stringResource(R.string.password),
                            color = Color.Gray
                        )
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Lock,
                            contentDescription = ""
                        )
                    }
                )

            //botão
                Button(
                    onClick = {},
                    modifier = Modifier
                        .align(Alignment.End)
                        .padding(bottom = 16.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF7C0B0B)
                    ),
                    shape = RoundedCornerShape(12.dp)

                ) {
                    Text(text = stringResource(R.string.sing_in))
                    Icon(
                        modifier = Modifier
                            .padding(start = 7.dp),
                        imageVector = Icons.Filled.ArrowForward,
                        contentDescription = ""
                    )
                }

                Row (
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ){
                    Text(
                        modifier = Modifier
                            .padding(end = 5.dp),
                        text = stringResource(R.string.text_sing_up),
                        fontSize = 15.sp,
                        color = Color.Gray
                    )
                    Text(
                        text = stringResource(R.string.sing_up),
                        fontSize = 15.sp,
                        color = Color(0xFF7C0B0B)
                    )
                }


            }
            


        }
    }

}




@Preview(showSystemUi = true)
@Composable
private fun TelaInicialPreview() {
    TelaInicial()

}