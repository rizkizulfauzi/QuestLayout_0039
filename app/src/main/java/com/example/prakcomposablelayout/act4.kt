package com.example.prakcomposablelayout

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
    }
}