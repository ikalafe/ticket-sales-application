package com.example.jcuiapp1.ui.screen.helper

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.jcuiapp1.models.Travel
import com.example.jcuiapp1.ui.theme.AppDarkGray
import com.example.jcuiapp1.ui.theme.AppLightGray
import com.example.jcuiapp1.ui.theme.AppWhite


@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun TravelCard(
    data: Travel
) {
    Card(
        onClick = {},
        shape = RoundedCornerShape(15.dp),
        modifier = Modifier
            .fillMaxSize()
            .padding(5.dp)
    ) {
        Box {
            Image(
                painter = painterResource(id = data.image),
                contentDescription = data.title,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillWidth
            )
            Text(
                text = data.title, color = AppWhite,
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(bottom = 25.dp, start = 15.dp)
            )
            Box(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(bottom = 15.dp, end = 15.dp)
            ) {
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .background(AppLightGray)
                        .padding(10.dp)
                ) {
                    Text(text = "${data.price}$", color = AppDarkGray)
                }
            }
        }
    }
}