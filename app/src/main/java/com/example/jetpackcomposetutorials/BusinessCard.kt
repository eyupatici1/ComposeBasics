package com.example.jetpackcomposetutorials

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Color(0xFFB69DF8) -> background color

@Composable
fun BusinessCardApp() {

    BusinessCard(
        name = stringResource(R.string.business_card_name),
        title = stringResource(R.string.business_card_title),
        number = stringResource(R.string.business_card_number),
        link = stringResource(R.string.business_card_link),
        email = stringResource(R.string.business_card_email),
        imagePainter = painterResource(R.drawable.android_logo_withbg),
        modifier = Modifier
    )

}

@Composable
fun BusinessCard(
    name: String,
    title: String,
    number: String,
    link: String,
    email: String,
    imagePainter: Painter,
    modifier: Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = imagePainter,
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            alignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth(0.3f)
                .background(Color(0xFF4F6C79))
        )
        Text(
            text = name,
            fontWeight = FontWeight.Normal,
            fontSize = 50.sp,
            modifier = Modifier.padding(12.dp)
        )
        Text(
            text = title,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 18.sp,
            color = colorResource(R.color.businessGreen)
        )
        Spacer(modifier = Modifier.padding(bottom = 150.dp))
        HorizontalDivider(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 12.dp),
            color = Color(0xFF4F6C79)
        )
        ContactRow(
            text = number,
            icon = Icons.Rounded.Phone
        )
        HorizontalDivider(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 12.dp),
            color = Color(0xFF4F6C79)
        )
        ContactRow(
            text = link,
            icon = Icons.Rounded.Share
        )
        HorizontalDivider(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 12.dp),
            color = Color(0xFF4F6C79)
        )
        ContactRow(
            text = email,
            icon = Icons.Rounded.Email
        )
    }
}

@Composable
fun ContactRow(
    text: String,
    icon: ImageVector,
) {
    Row(
        modifier = Modifier.padding(bottom = 16.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = colorResource(R.color.businessGreen),
            modifier = Modifier.weight(1f)
        )
        Text(
            text = text,
            color = Color.Black,
            modifier = Modifier
                .weight(3f)
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun BusinessCardPreview() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = colorResource(R.color.backgroundGreen)
    ) {
        BusinessCardApp()
    }
}
