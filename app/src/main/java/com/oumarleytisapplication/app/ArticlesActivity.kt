package com.oumarleytisapplication.app

import ArticleAdapter
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ArticlesActivity : AppCompatActivity(), Parcelable {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_articles)

        // Récupérer les articles depuis la base de données
        val articles = getArticles()

        // Afficher les articles dans une liste (par exemple, en utilisant RecyclerView)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ArticleAdapter(articles)
    }

    // Méthode pour récupérer les articles depuis la base de données
    private fun getArticles(): List<Article> {
        // Implémenter ici le code pour récupérer les articles depuis la base de données
        // Retourner la liste des articles
        return emptyList() // Retourne une liste vide pour le moment
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ArticlesActivity> {
        override fun createFromParcel(parcel: Parcel): ArticlesActivity {
            return ArticlesActivity()
        }

        override fun newArray(size: Int): Array<ArticlesActivity?> {
            return arrayOfNulls(size)
        }
    }
}
