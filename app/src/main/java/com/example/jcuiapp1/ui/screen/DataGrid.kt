package com.example.jcuiapp1.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.jcuiapp1.models.Travel
import com.example.jcuiapp1.ui.screen.helper.TravelCard


@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun DataGrid(travels: List<Travel>) {
    Column(
        Modifier
            .fillMaxWidth()
            .padding(start = 25.dp, end = 25.dp)
    ) {
        LazyVerticalStaggeredGrid(columns = StaggeredGridCells.Fixed(2)) {
            items(travels.size) {
                TravelCard(travels[it])
            }
        }
    }
}
