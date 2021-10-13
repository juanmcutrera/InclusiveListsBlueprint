package com.bitropia.inclusivelistsblueprint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import com.bitropia.inclusivelistsblueprint.theme.InclusiveListsTheme
import com.bitropia.inclusivelistsblueprint.theme.textField
import com.bitropia.inclusivelistsblueprint.ui.viewmodels.ListHeaderViewModel
import dagger.hilt.android.AndroidEntryPoint
import androidx.activity.viewModels
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivity : AppCompatActivity() {



    private val viewModel: ListHeaderViewModel by viewModels()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContent {
           // NewsStory()
            HelloContent()

        }
    }
}


@Composable
fun NewsStory() {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {


        Text("A day in Shark Fin Cove",color = Color.White)
        Text("Davenport, California",color = Color.White)
        Text("December 2018",color = Color.Yellow)
    }
}
/*
@Preview
@Composable
fun DefaultPreview() {
    //NewsStory()
    HelloContent()
}*/

class HelloViewModel : ViewModel() {

    // LiveData holds state which is observed by the UI
    // (state flows down from ViewModel)
    private val _name = MutableLiveData("")
    val name: LiveData<String> = _name

    // onNameChange is an event we're defining that the UI can invoke
    // (events flow up from UI)
    fun onNameChange(newName: String) {
        _name.value = newName
    }
}



@Composable
fun HelloContent() {
    /*InclusiveListsTheme {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            OutlinedTextField(
                value = "",
                onValueChange = { },
                label = { Text("Name") }
            )
        }
    }*/


    InclusiveListsTheme{

        Column(

            //modifier = Modifier.padding(16.dp)

            //horizontalAlignment = Alignment.CenterHorizontally,
            //modifier = Modifier.fillMaxWidth()
            Modifier
                .fillMaxSize()
                .padding(32.dp),
                horizontalAlignment = Alignment.CenterHorizontally
        )
        {
           /* Text(
                text = "Hello!",
                textAlign = TextAlign.Right,
                //modifier = Modifier.padding(bottom = 8.dp),
                //style = MaterialTheme.typography.h5,
                color = Color.White,



            )*/
            val textState = remember { mutableStateOf(TextFieldValue()) }


            OutlinedTextField(

                value = textState.value,
                onValueChange = { textState.value = it },
                label = { Text("Description") },
                textStyle = TextStyle(color = MaterialTheme.colors.textField,
                    fontWeight = FontWeight.Normal),
               /* colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = MaterialTheme.colors.secondary,
                    unfocusedBorderColor = MaterialTheme.colors.secondary,
                    focusedLabelColor = MaterialTheme.colors.secondary,
                    cursorColor = MaterialTheme.colors.primaryVariant
                ),*/
            )
        }
    }



}

