package com.example.MVVMCompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.MVVMCompose.ui.CounterScreen
import com.example.MVVMCompose.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                CounterScreen()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun MyPreview() {
    MyApplicationTheme {
        CounterScreen()
    }
}