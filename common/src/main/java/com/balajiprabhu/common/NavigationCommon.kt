package com.balajiprabhu.common

import kotlinx.serialization.Serializable

sealed class SubGraphDestination {
    @Serializable
    data object AuthSubGraph : SubGraphDestination()
    @Serializable
    data object DashboardSubGraph : SubGraphDestination()
}

sealed class Destination {
    @Serializable
    data object Auth : Destination()
    @Serializable
    data object Dashboard : Destination()
}