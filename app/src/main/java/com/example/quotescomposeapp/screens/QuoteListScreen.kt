package com.example.quotescomposeapp.screens

import androidx.compose.foundation.layout.Column


import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.quotescomposeapp.models.Quotes

@Composable
fun QuoteListScreen(data:Array<Quotes>, onClick: (quotes: Quotes)->Unit) {

    Column(){
        Text(
            text = "Quotes App",

            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.ExtraBold,
            fontStyle = FontStyle.Italic,

            modifier = Modifier
                .padding(8.dp, 24.dp)
                .fillMaxWidth(1f)




        )
        QuoteList(data = data , onClick)
    }
    
}