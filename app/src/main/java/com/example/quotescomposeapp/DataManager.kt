package com.example.quotescomposeapp

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.example.quotescomposeapp.models.Quotes

import com.google.gson.Gson
import java.nio.charset.Charset
import kotlin.text.Charsets.UTF_8


object DataManager {
    var data = emptyArray<Quotes>()
    var currentQuotes: Quotes? = null
    var currentPage= mutableStateOf(Pages.LISTING)
    var isDataLoaded = mutableStateOf(false)

    fun loadAssetsFromFile(context: Context) {

        val inputStream = context.assets.open("quotes.json")
        val size: Int = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer, UTF_8 )
        val gson = Gson()
        data = gson.fromJson(json, Array<Quotes>::class.java)
        isDataLoaded.value = true


    }

    fun switchPages(quotes: Quotes?){
        if(currentPage.value==Pages.LISTING){
            currentQuotes = quotes
            currentPage.value = Pages.DETAILS
        }
        else{
            currentPage.value=Pages.LISTING
        }
    }
}

