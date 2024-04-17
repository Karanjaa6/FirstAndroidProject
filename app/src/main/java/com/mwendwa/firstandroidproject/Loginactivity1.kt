package com.mwendwa.firstandroidproject

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mwendwa.firstandroidproject.ui.theme.FIRSTANDROIDPROJECTTheme

class Loginactivity1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FIRSTANDROIDPROJECTTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        LoginScreenPreview()
                        Button(onClick ={val intent = Intent(this@Loginactivity1,MainActivity::class.java)
                                        startActivity(intent)
                                        },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            colors = ButtonDefaults.buttonColors(Color.Black)) {
                            Text(text = "Login here")
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Button(onClick ={},
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            colors = ButtonDefaults.buttonColors(Color.DarkGray)) {
                            Text(text = "Register Here")
                        }
                    }

                }
            }
        }
    }
}
@Composable
fun LoginScreen(name: String){
    Column(
        modifier = Modifier
            .clip(shape = RoundedCornerShape(20.dp)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Text(text = "Please Login here!!!",
            fontSize = 15.sp,
            color = Color.Black  ,
            fontFamily = FontFamily.SansSerif,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center,

            modifier = Modifier
                .background(Color.Green)
                .padding(20.dp)
                .wrapContentHeight(align = Alignment.CenterVertically)
                .height(100.dp)
                .wrapContentHeight(align = Alignment.Top)
                .fillMaxWidth()
        )
        ImageComponent()
        Spacer(modifier = Modifier.height(20.dp))
        TextFieldUsername()
        Spacer(modifier = Modifier.height(20.dp))
        TextEmailComponents()
        Spacer(modifier = Modifier.height(20.dp))
        TextPasswordComponent()
        Spacer(modifier = Modifier.height(20.dp))

    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenPreview(){
    LoginScreen(name = "Login here")
}
@Composable
fun TextFieldUsername() {
    var text by remember {
        mutableStateOf(value = "")
    }
    TextField(modifier = Modifier.fillMaxWidth(),
        value = text, onValueChange = { newtext ->
            text = newtext
        },
        label = { Text(text = "Enter your name") },
        placeholder = {
            Text(text = "Please enter your name")
        }
    )
}
@Composable
fun TextEmailComponents(){
    var text by remember {
        mutableStateOf(value = "")
    }
    TextField(modifier =Modifier.fillMaxWidth() ,
        value =text , onValueChange ={
                newtext-> text = newtext
        },
        label =  { Text(text = "Enter your email")},
        placeholder = {
            Text(text = "Please enter your email")
        }
    )
}
@Composable
fun TextPasswordComponent(){
    var text by remember {
        mutableStateOf(value = "")
    }
    TextField(modifier =Modifier.fillMaxWidth() ,
        value =text , onValueChange ={
                newtext-> text = newtext
        },
        label =  { Text(text = "Enter your password")},
        placeholder = {
            Text(text = "Please enter your password")
        }
    )
}
@Composable
fun ImageComponent(){
    Image(modifier = Modifier
        .wrapContentHeight()
        .fillMaxWidth()
        .height(80.dp),
        painter = painterResource(id = R.drawable.logo),
        contentDescription ="My Logo")
}
