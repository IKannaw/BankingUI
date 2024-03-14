package com.example.bankingapp.data

import android.media.Image
import androidx.compose.ui.graphics.vector.ImageVector

data class Currency (
    val name:String,
    val buy:Float,
    val sell:Float,
    val icon:ImageVector
)