package dev.androidbroadcast.newsapi.models

import kotlinx.serialization.SerialName

//relevancy, popularity, publishedAt
enum class SortBy {

    @SerialName("relevancy")
    RELEVANCY,

    @SerialName("popularity")
    POPULARITY,

    @SerialName("publishedAt")
    PUBLISHED_AT
}