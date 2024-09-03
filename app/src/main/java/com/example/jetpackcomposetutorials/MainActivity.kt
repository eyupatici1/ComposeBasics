package com.example.jetpackcomposetutorials

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetutorials.ui.theme.JetpackComposeTutorialsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTutorialsTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(colorResource(R.color.backgroundGreen))
                ) {
                    /* GreetingImage(
                        message = "Happy Birthday Sam!",
                        from = "-from Emma",
                        //modifier = Modifier.padding(8.dp)
                    ) */
                    //ComposeTutorialApp()
                    //TaskManagerApp()
                    //ComposeQuadrantApp()
                    BusinessCardApp()
                }
            }
        }
    }
}

// All UI functions must have "@Composable" annotation
// The composable function must provide default values for any parameters to preview it.
// For this reason, it is recommended not to preview the Greeting() function directly.
// Instead, you need to add another function, the BirthdayCardPreview() function in this case,
// that calls the Greeting() function with an appropriate parameter.
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

// "@Preview" annotations can take parameters just like functions
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeTutorialsTheme {
        Greeting("Android")
    }
}

//  The code you added to the GreetingPreviewDark() function with the @Preview annotation is only for
//  previewing in the Design pane in Android Studio. These changes aren't reflected in the app.
@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "With SystemUI and Dark Theme Preview",
    fontScale = 3f
)
@Composable
fun GreetingPreviewDark() {
    JetpackComposeTutorialsTheme(darkTheme = true) {
        Greeting("Android")
    }
}

// As a naming convention all composable functions should be nouns and pascal-cased
@Composable
fun FancyButton(text: String) {
}

@Composable
fun BackButtonHandler() {
}

@Composable
fun BirthdayCardPreview() {
}

// It's a best practice to have your Composable accept a Modifier parameter,
// and pass that modifier to its first child.
@Composable
fun GreetingText(message: String, from: String, modifier: Modifier) {
    Column(
        modifier = modifier.padding(8.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = message,
            fontSize = 80.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingTextPreview() {
    JetpackComposeTutorialsTheme {
        GreetingImage(
            message = "Happy Birthday Sam!",
            from = "-from Emma",
            modifier = Modifier.padding(8.dp)
        )
    }
}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val backgroundImage = painterResource(R.drawable.androidparty)
    Box {
        Image(
            painter = backgroundImage,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )
        GreetingText(
            message = message,
            from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }

}






