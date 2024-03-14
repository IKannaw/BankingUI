package com.example.bankingapp

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AttachMoney
import androidx.compose.material.icons.rounded.CurrencyYen
import androidx.compose.material.icons.rounded.Euro
import androidx.compose.material.icons.rounded.KeyboardArrowDown
import androidx.compose.material.icons.rounded.KeyboardArrowUp
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.bankingapp.data.Currency

val currencies = listOf<Currency>(
    Currency(
        name = "USD", buy = 23.35f, sell = 23.25f, icon = Icons.Rounded.AttachMoney
    ),
    Currency(
        name = "EUR", buy = 13.25f, sell = 13.15f, icon = Icons.Rounded.Euro
    ),
    Currency(
        name = "YEN", buy = 25.35f, sell = 23.25f, icon = Icons.Rounded.CurrencyYen
    ),
    Currency(
        name = "USD", buy = 23.35f, sell = 23.25f, icon = Icons.Rounded.AttachMoney
    ),
)

@Preview(showBackground = true)
@Composable
fun CurrenciesSection() {
    var isVisible by remember { mutableStateOf(false) }
    var iconState by remember { mutableStateOf(Icons.Rounded.KeyboardArrowUp) }


}