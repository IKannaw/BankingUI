package com.example.bankingapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.MonetizationOn
import androidx.compose.material.icons.rounded.StarHalf
import androidx.compose.material.icons.rounded.Wallet
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bankingapp.data.Finace
import com.example.bankingapp.ui.theme.BlueStart
import com.example.bankingapp.ui.theme.GreenStart
import com.example.bankingapp.ui.theme.OrangeStart
import com.example.bankingapp.ui.theme.PurpleStart

var finace = listOf<Finace>(
    Finace(
        icon = Icons.Rounded.StarHalf,
        name = "My\nBusiness",
        background = OrangeStart,
    ),
    Finace(
        icon = Icons.Rounded.Wallet,
        name = "My\nWallet",
        background = BlueStart,
    ),
    Finace(
        icon = Icons.Rounded.StarHalf,
        name = "Finace\nAnalytics",
        background = PurpleStart,
    ),
    Finace(
        icon = Icons.Rounded.MonetizationOn,
        name = "My\nTransaction",
        background = GreenStart,
    )
)

@Preview(showBackground = true)
@Composable
fun FinaceSection(){
     Column {
         Text(text = "Finace Section", fontSize = 24.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(16.dp))
         LazyRow {
          items(finace.size){
            FinaceItem()
          }
         }
     }
}

@Composable
fun  FinaceItem(){

}