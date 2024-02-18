package com.loc.newsapp.presentation.navgraph

sealed class Route(
    val route: String
) {
    object OnBoardingScreen:Route(route = "OnBoardingScreen")
    object HomeScreen:Route(route = "homeScreen")
    object SearchScreen:Route(route = "searchScreen")
    object BookMarkScreen:Route(route = "bookmarkScreen")
    object DeatailsScreen:Route(route = "detailsScreen")
    object AppStartNavigation:Route(route = "appStartNavigation")
    object NewsNavigation:Route(route = "newsNavigation")
    object NewsNavigationScreen:Route(route = "newsNavigationScreen")
}