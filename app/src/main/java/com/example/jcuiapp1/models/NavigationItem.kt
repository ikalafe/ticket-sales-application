package com.example.jcuiapp1.models

import androidx.annotation.DrawableRes
import com.example.jcuiapp1.R

sealed class NavigationItem(var route: String, val title: String, @DrawableRes var icon: Int) {
    object Home :NavigationItem("home","Home", R.drawable.ic_home)
    object Favorites :NavigationItem("favorites","Favorites", R.drawable.ic_heart)
    object Tickets :NavigationItem("tickets","Tickets", R.drawable.ic_ticket)
    object Profile :NavigationItem("profile","Profile", R.drawable.ic_user)
}
