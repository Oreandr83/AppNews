package com.example.newsappktl.Repository

import com.example.newsappktl.Api.RetrofitInstance
import com.example.newsappktl.DB.ArticleDatabase
import com.example.newsappktl.Model.Article

class NewsRepository(

    val db: ArticleDatabase
) {

    suspend fun getListNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getNews(countryCode, pageNumber)

     suspend fun searchNews(searchQuery: String, pageNumber: Int) =
         RetrofitInstance.api.searchForNews(searchQuery, pageNumber)

    suspend fun upsert(article: Article) = db.getArticleDao().upsert(article)

    fun getSavedNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}