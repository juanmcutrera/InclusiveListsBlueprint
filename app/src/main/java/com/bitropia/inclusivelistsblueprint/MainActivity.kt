package com.bitropia.inclusivelistsblueprint

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import com.bitropia.inclusivelistsblueprint.ui.theme.InclusiveListsTheme
import com.bitropia.inclusivelistsblueprint.ui.theme.textField
import com.bitropia.inclusivelistsblueprint.ui.viewmodels.ListHeaderViewModel
import dagger.hilt.android.AndroidEntryPoint
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.Dp
import com.bitropia.inclusivelistsblueprint.domain.entities.ListHeader
import javax.inject.Inject

import com.bitropia.inclusivelistsblueprint.domain.usecases.SaveListHeaderUseCase

@AndroidEntryPoint
class MainActivity @Inject constructor() : AppCompatActivity() {
    @Inject
    lateinit var saveListHeader : SaveListHeaderUseCase

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContent {
            MainContent(saveListHeader)

        }
    }
}


/*
@Preview
@Composable
fun DefaultPreview() {
    //NewsStory()
    HelloContent()
}*/



@Composable
fun MainContent(


    saveListHeader:  SaveListHeaderUseCase,
    viewModel: ListHeaderViewModel =  ListHeaderViewModel(saveListHeader)

) {

    MainScreen(
        viewModel = viewModel
    )


}

@Composable
fun MainScreen(
    viewModel: ListHeaderViewModel
) {

   // val (value, onValueChange) = rememberSaveable { mutableStateOf("") }
    var headerdescription by rememberSaveable { mutableStateOf("") }

    val onheaderdescriptionTextChange = { text : String ->
        headerdescription = text
    }


    InclusiveListsTheme{

        Column(

            Modifier
                .fillMaxSize()
                .padding(32.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {

            OutlinedTextField(


                value = headerdescription,
                onValueChange = onheaderdescriptionTextChange,
                label = { Text("Description") },
                textStyle = TextStyle(color = MaterialTheme.colors.textField,
                    fontWeight = FontWeight.Normal),

                )
            val context = LocalContext.current

            Button(

                onClick = {

                    Toast.makeText(
                        context,
                        "Guardando.... " + headerdescription,

                        Toast.LENGTH_SHORT
                    ).show()

                   viewModel.saveListHeader(ListHeader(0,
                        headerdescription))
                },
                modifier = Modifier.padding(all = Dp(10F)),
                enabled = true,
                shape = MaterialTheme.shapes.medium,
            )

            {
                Text(text = "Guardar", color = Color.White)
            }
        }
    }
}


