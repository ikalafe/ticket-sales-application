package com.example.jcuiapp1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jcuiapp1.models.Travel
import com.example.jcuiapp1.ui.screen.DataGrid
import com.example.jcuiapp1.ui.screen.HeaderFilter
import com.example.jcuiapp1.ui.screen.HeaderGreeting
import com.example.jcuiapp1.ui.screen.HeaderSearch
import com.example.jcuiapp1.ui.screen.helper.NavBar
import com.example.jcuiapp1.ui.theme.JCUiApp1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JCUiApp1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainView()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainView() {

    var filterList = listOf("All", "Flight", "Cruise", "Train", "Car", "Ship")

    val travels = listOf(
        Travel("Paris", 120, R.drawable.paris),
        Travel("Rome", 150, R.drawable.rome),
        Travel("Tehran", 240, R.drawable.tehran),
        Travel("Spain", 180, R.drawable.spain),
        Travel("Bali", 170, R.drawable.bali),
        Travel("Hawaii", 290, R.drawable.hawaii),
    )

    Scaffold(
        bottomBar = {
            NavBar()
        }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            Column(modifier = Modifier.fillMaxWidth()) {
                HeaderGreeting()
                Spacer(modifier = Modifier.height(15.dp))
                HeaderSearch()
                Spacer(modifier = Modifier.height(10.dp))
                HeaderFilter(filterList)
                Spacer(modifier = Modifier.height(15.dp))
                DataGrid(travels)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JCUiApp1Theme {
        MainView()
    }
}