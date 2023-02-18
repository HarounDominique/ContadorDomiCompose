package com.example.contadordomicompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.contadordomicompose.ui.theme.ContadorDomiComposeTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.*
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ContadorDomiComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    var cont1 by remember { mutableStateOf(0) }
    var cont2 by remember { mutableStateOf(0) }
    var contGlobal by remember { mutableStateOf(0) }
    var incrementoCont1 by remember { mutableStateOf(1) }
    var incrementoCont2 by remember { mutableStateOf(1) }
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(Modifier.weight(1f), verticalArrangement = Arrangement.Center) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Button(onClick = { cont1+incrementoCont1; contGlobal+incrementoCont1 }) {
                    Text("Contador 1")
                }
                Text(" $cont1")
                Icon(Icons.Filled.Delete, contentDescription = "Papelera", Modifier.clickable { })
            }
            Row() {
                Text("Incremento: $incrementoCont1")

            }
        }
        Column(Modifier.weight(1f)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Button(onClick = { cont2+incrementoCont2; contGlobal+incrementoCont2 }) {

                    Text("Contador 2")
                }
                Text(" $cont2")
                Icon(Icons.Filled.Delete, contentDescription = "Papelera")
            }
            Row() {
                Text("Incremento: $incrementoCont2")

            }
        }

        Row(Modifier.weight(1f)) {
            Text("Global $contGlobal")
            Icon(Icons.Filled.Delete, contentDescription = "Papelera")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ContadorDomiComposeTheme {
        MainScreen()
    }
}