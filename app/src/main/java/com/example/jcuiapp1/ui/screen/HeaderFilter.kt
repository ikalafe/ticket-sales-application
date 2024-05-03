package com.example.jcuiapp1.ui.screen

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.jcuiapp1.ui.theme.AppDarkGray
import com.example.jcuiapp1.ui.theme.AppLightGray
import com.example.jcuiapp1.ui.theme.AppRed
import com.example.jcuiapp1.ui.theme.AppWhite

@Composable
fun HeaderFilter(filterList: List<String>) {
    var selectedFilterIndex by remember { mutableStateOf(0) }
    LazyRow(modifier = Modifier.padding(25.dp, 0.dp, 0.dp, 0.dp)) {
        items(filterList.size) { index ->
            TextButton(
                onClick = { selectedFilterIndex = index },
                colors = ButtonDefaults.textButtonColors(
                    contentColor = if (selectedFilterIndex == index) AppWhite else AppDarkGray,
                    containerColor = if (selectedFilterIndex == index) AppRed else AppLightGray
                ),
                shape = RoundedCornerShape(15.dp)
            ) {
                Text(text = filterList[index])
            }
            Spacer(modifier = Modifier.width(10.dp))
        }
    }
}