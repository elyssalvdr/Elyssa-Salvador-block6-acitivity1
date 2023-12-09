package com.salvador.elyssa.block6.p1.quiz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Setup RecyclerView for Featured Books
        val featuredBooksRecyclerView: RecyclerView = findViewById(R.id.recyclerFeaturedBooks)
        featuredBooksRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        featuredBooksRecyclerView.adapter = FeaturedBooksAdapter(getFeaturedBooks())

        // Setup RecyclerView for Authors
        val authorsRecyclerView: RecyclerView = findViewById(R.id.recyclerAuthors)
        authorsRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        authorsRecyclerView.adapter = AuthorsAdapter(getAuthors())
    }

    private fun getFeaturedBooks(): List<Book> {
        // TODO: Return a list of featured books
        return emptyList()
    }

    private fun getAuthors(): List<Author> {
        // TODO: Return a list of authors
        return emptyList()
    }
}
