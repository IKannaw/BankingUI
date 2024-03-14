package com.example.bankingapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bankingapp.data.Card
import com.example.bankingapp.ui.theme.BlueEnd
import com.example.bankingapp.ui.theme.BlueStart
import com.example.bankingapp.ui.theme.GreenEnd
import com.example.bankingapp.ui.theme.GreenStart
import com.example.bankingapp.ui.theme.OrangeEnd
import com.example.bankingapp.ui.theme.OrangeStart
import com.example.bankingapp.ui.theme.PurpleEnd
import com.example.bankingapp.ui.theme.PurpleStart
import org.intellij.lang.annotations.PrintFormat

var cards = listOf<Card>(
    Card(
        cardType = "VISA",
        cardNumber = "3664 7865 3786 3976",
        cardName = "Business",
        balance = 92.56,
        color = getGradient(PurpleStart, PurpleEnd),
    ),
    Card(
        cardType = "Master Card",
        cardNumber = "234 5766 4906 5676",
        cardName = "Saving",
        balance = 19.34,
        color = getGradient(BlueStart, BlueEnd),
    ),
    Card(
        cardType = "VISA",
        cardNumber = "324 6341 2468 9980",
        cardName = "School",
        balance = 83.56,
        color = getGradient(OrangeStart, OrangeEnd),
    ),
    Card(
        cardType = "Master Card",
        cardNumber = "112 4576 3207 3405",
        cardName = "Trips",
        balance = 35.34,
        color = getGradient(GreenStart, GreenEnd),
    ),
)

fun getGradient(startColor: Color, endColor: Color): Brush {
    return Brush.horizontalGradient(colors = listOf(startColor, endColor))
}

@Preview(showBackground = true)
@Composable
fun CardSection() {
    LazyRow {
        items(cards.size) { index ->
            CardItem(index)
        }
    }
}


@Composable
fun CardItem(index: Int) {
    val card = cards[index];

    var lastItemPadding = 0.dp;

    if (index == cards.size - 1) {
        lastItemPadding = 16.dp;
    }
    var image = painterResource(id = R.drawable.ic_visa)

    if (card.cardType == "Master Card") {
        image = painterResource(id = R.drawable.ic_mastercard)
    }

    Box(modifier = Modifier.padding(start = 16.dp, end = lastItemPadding)) {
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
                .background(card.color)
                .width(250.dp)
                .height(160.dp)
                .padding(horizontal = 16.dp, vertical = 12.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = image,
                contentDescription = card.cardName,
                modifier = Modifier.width(60.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = card.cardName,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )

            Text(text = "$ ${card.balance}", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 22.sp)

            Text(text = card.cardNumber, color = Color.White, fontWeight = FontWeight.Bold, fontSize = 16.sp)
        }
    }
}