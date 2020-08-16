package com.example.newsappktl.Model

import com.example.newsappktl.Model.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)