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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mwendwa.firstandroidproject.ui.theme.FIRSTANDROIDPROJECTTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FIRSTANDROIDPROJECTTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .height(400.dp)
                        .padding(5.dp),

                    color = MaterialTheme.colorScheme.background
                ) {

                }
                Column(modifier = Modifier.fillMaxSize()) {
                    HelloWorld("Rza")
                    Spacer(modifier = Modifier.height(0.dp))
                    Button(onClick ={val intent=Intent(this@MainActivity,BackgroundActivity::class.java)
                        startActivity(intent)},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        colors = ButtonDefaults.buttonColors(Color.LightGray)) {
                        Text(text = "Background Image")
                    }
                    Button(onClick ={
                        val intent = Intent(this@MainActivity,Loginactivity1::class.java)
                        startActivity(intent)
                    },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        colors = ButtonDefaults.buttonColors(Color.Magenta)) {
                        Text(text = "Login here")
                    }
                    Spacer(modifier = Modifier.height(0.dp))
                    Button(onClick ={},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        colors = ButtonDefaults.buttonColors(Color.LightGray)) {
                        Text(text = "Register Here")
                    }

                }
        }
    }
}
@Composable
fun HelloWorld(name:String){
   Column(
       modifier = Modifier
           .clip(shape = RoundedCornerShape(20.dp)),
       verticalArrangement = Arrangement.Center,
       horizontalAlignment = Alignment.CenterHorizontally

   ) {

       Text(text = "Hey $name!This is my first Android Project and i'm excited about it.",
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

//       )
//       Text(text = "Hey $name!I am a software developer/Android Developer",
//           fontSize = 15.sp,
//           color = Color.Blue ,
//           fontFamily = FontFamily.SansSerif,
//           fontStyle = FontStyle.Italic,
//           textAlign = TextAlign.Center,
//
//           modifier = Modifier.background(Color.Gray)
//               .padding(20.dp)
//               .wrapContentHeight(align = Alignment.CenterVertically)
//               .height(100.dp)
//               .wrapContentHeight(align = Alignment.Top)
//       )
//       Text(text = "Hey $name!I can finally create apps and i will take over the world.",
//           fontSize = 15.sp,
//           color = Color.White  ,
//           fontFamily = FontFamily.SansSerif,
//           fontStyle = FontStyle.Italic,
//           textAlign = TextAlign.Center,
//
//           modifier = Modifier.background(Color.Black)
//               .padding(20.dp)
//               .wrapContentHeight(align = Alignment.CenterVertically)
//               .height(100.dp)
//               .wrapContentHeight(align = Alignment.Top)
       )
       Spacer(modifier = Modifier.height(20.dp))
       ImageComponent()
       Spacer(modifier = Modifier.height(20.dp))
       TextFieldComponent()
       Spacer(modifier = Modifier.height(20.dp))
       TextEmailComponent()
       Spacer(modifier = Modifier.height(20.dp))
       TextLocationComponent()
       Spacer(modifier = Modifier.height(20.dp))
       PasswordTextField()
       Spacer(modifier = Modifier.height(20.dp))

       }


   }

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HelloWorldPreview(){
    HelloWorld("Moss")
}
@Composable
fun TextFieldComponent() {
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
    fun TextEmailComponent(){
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
    fun TextLocationComponent(){
        var text by remember {
            mutableStateOf(value = "")
        }

    TextField(modifier =Modifier.fillMaxWidth() ,
            value =text , onValueChange ={
                    newtext-> text = newtext
            },
            label =  { Text(text = "Enter your location")},
            placeholder = {
                Text(text = "Please enter your location")
            }
        )
    }
@Composable
fun PasswordTextField(){

    var password by rememberSaveable {mutableStateOf("") }
    var passwordVisibility by remember { mutableStateOf(false) }

    val icon = if (passwordVisibility)
        painterResource(id = R.drawable.design_ic_visibility)
    else
        painterResource(id = R.drawable.design_ic_visibility_off)

    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value =password ,
        onValueChange = {
            password =it
        },
        placeholder = { Text(text = "Password")},
        label = { Text(text = "Password")},
        trailingIcon = {
            IconButton(onClick ={
                passwordVisibility=!passwordVisibility

            }) {
                Icon(painter =icon ,
                    contentDescription ="Visibility Icon" )
            }
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Password
        ),
        visualTransformation = if (passwordVisibility) VisualTransformation.None
        else PasswordVisualTransformation()

        )
}
}


