package com.example.prakcomposablelayout

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ActivitasPertama(modifier: Modifier){
    column(
        modifier = Modifier.padding(top = 100.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
    Text(
        stringResource(id = R.string.prodi),
        fontSize = 35.sp,
        fontWeight = FontWeight.Bold
    )
        Text(
            stringResource(id = R.string.univ),
            fontSize = 22.sp,
        )
        Spacer(modifier = Modifier.height(25.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth(fraction = 1f)
                .padding(all = 12.dp),
            colors = CardDefaults.cardColors(
                containerColor = colorResource(id = R.color.card_0_bg))
        )

        {
            Row(){
                val gambar = painterResource(id= R.drawable.logo_umy)
            }
        }
    }
}