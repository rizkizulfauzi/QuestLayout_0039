package com.example.prakcomposablelayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.prakcomposablelayout.AktivitasPertama
import com.example.prakcomposablelayout.ui.theme.PrakComposableLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrakComposableLayoutTheme() {
                Scaffold(modifier = Modifier.fillMaxSize()) {  innerPadding ->
                    AktivitasPertama(modifier = Modifier)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AktivitasPertamaPreview() {
    PrakComposableLayoutTheme() {
        AktivitasPertama(modifier = Modifier)
    }
}