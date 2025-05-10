package org.example.compose_web

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import org.example.compose_web.page.anniversary.AnniversaryMainPage

//import androidx.compose.desktop.ui.tooling.preview.Preview

//import org.jetbrains.compose.ui.tooling.preview.Preview

//@Preview
@Composable
fun App() {
    MaterialTheme {
        AnniversaryMainPage()
    }
}

