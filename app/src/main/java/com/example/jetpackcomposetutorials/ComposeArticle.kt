package com.example.jetpackcomposetutorials

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetutorials.ui.theme.JetpackComposeTutorialsTheme

@Composable
fun ComposeTutorialApp() {
    ComposeTutorialCard(
        title = stringResource(R.string.title_tutorial),
        desc = stringResource(R.string.desc_tutorial),
        text = stringResource(R.string.text_tutorial),
        imagePainter = painterResource(R.drawable.bg_compose_background),
        modifier = Modifier.fillMaxSize()
    )
}

@Composable
fun ComposeTutorialCard(
    title: String,
    desc: String,
    text: String,
    imagePainter: Painter,
    modifier: Modifier
) {
    Column {
        Image(
            painter = imagePainter,
            contentDescription = null,
            contentScale = ContentScale.FillWidth
        )
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier.padding(
                start = 16.dp,
                top = 16.dp,
                end = 16.dp,
                bottom = 16.dp
            )
        )
        Text(
            text = desc,
            fontSize = 14.sp,
            modifier = Modifier.padding(
                start = 16.dp,
                end = 16.dp
            ),
            textAlign = TextAlign.Justify
        )
        Text(
            text = text,
            fontSize = 14.sp,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun ComposeTutorialPreview() {
    JetpackComposeTutorialsTheme {
        ComposeTutorialApp()
    }
}