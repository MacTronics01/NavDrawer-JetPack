package com.example.navdrawerjetpack

sealed class NavDrawerItem(var route: String, var icon: Int, var title: String) {
    object Home : NavDrawerItem("home", R.drawable.woman, "Home")
    object Music : NavDrawerItem("music", R.drawable.woman, "Music")
    object Movies : NavDrawerItem("movies", R.drawable.woman, "Movies")
    object Books : NavDrawerItem("books", R.drawable.woman, "Books")
    object Profile : NavDrawerItem("profile", R.drawable.woman, "Profile")
    object Settings : NavDrawerItem("settings", R.drawable.woman, "Settings")
}