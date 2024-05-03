package com.example.jcuiapp1.ui.screen.helper

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jcuiapp1.models.NavigationItem
import com.example.jcuiapp1.ui.theme.AppMenuGray
import com.example.jcuiapp1.ui.theme.AppWhite

@Composable
fun NavBar() {
    val menu = listOf(
        NavigationItem.Home,
        NavigationItem.Favorites,
        NavigationItem.Tickets,
        NavigationItem.Profile,
    )
    var selectedMenu by remember { mutableStateOf(0) }
    NavigationBar(
        modifier = Modifier
            .background(AppWhite),
        contentColor = AppMenuGray
    ) {
        menu.forEachIndexed { index, navigationItem ->
            NavigationBarItem(
                selected = selectedMenu == index,
                onClick = { selectedMenu = index },
                icon = {
                    Icon(
                        painter = painterResource(id = navigationItem.icon),
                        contentDescription = navigationItem.title,
                        modifier = Modifier.size(20.dp)
                    )
                },
                label = {
                    Text(text = navigationItem.title)
                },
                alwaysShowLabel = false
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    NavBar()
}