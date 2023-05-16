package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val font1= FontFamily(
            Font( R.font.loraregular, FontWeight.Thin)
        )
        setContent {

            Box(modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF101010))){
                Text(
                    text = buildAnnotatedString {
                                               withStyle(
                                                   style = SpanStyle(
                                                       color = Color.Green,
                                                    fontSize = 50.sp,
//                                                       fontFamily = FontFamily(Font(R.font.poppinsregular))
                                                   )
                                               ){
                                                   append("S")
                                               }
                        append("alma ")
                        withStyle(
                            style=SpanStyle(
                                color = Color.Green,
                                fontSize = 50.sp
                            )
                        ){
                            append("K")
                        }
                        append("han")
                    },
                    color = Color.White,
                    fontSize = 32.sp,
                    fontFamily = FontFamily(
                    Font(R.font.lexendregular))
                , fontWeight = FontWeight.Bold
                , fontStyle = FontStyle.Italic
                , textAlign = TextAlign.Center,
                    textDecoration = TextDecoration.Underline,

                )
            }

        }
    }
}

