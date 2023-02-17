package com.example.contadordomicompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.contadordomicompose.ui.theme.ContadorDomiComposeTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.Icon

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
    Column(Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Column(Modifier.weight(1f)) {
            Row() {
                Button(onClick = { /*TODO*/ }) {
                    val cont1 = 0
                    Text("Contador 1 $cont1")
                    //Clickable(onClick = { /* tu acción al hacer clic */ }) {
                        //Icon(Icons.Filled.Delete, contentDescription = "Papelera")
                    //}
                }
            }
            Row() {
                Text("Incremento:")
            }
        }
        Column(Modifier.weight(1f)) {
            Row() {
                Button(onClick = { /*TODO*/ }) {
                    val cont2 = 0
                    Text("Contador 2 $cont2")
                }
            }
            Row() {
                Text("Incremento:")
                Icon(Icons.Filled.Delete, contentDescription = "Papelera")

            }
        }
        Column(Modifier.weight(1f)) {
            Row() {
                val contGlobal = 0
                Text("Global $contGlobal")
                Icon(Icons.Filled.Delete, contentDescription = "Papelera")
            }
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