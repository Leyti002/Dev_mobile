
import com.oumarleytisapplication.app.Article
import com.oumarleytisapplication.app.DatabaseHelper
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var databaseHelper: DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        databaseHelper = DatabaseHelper(this)

        // Ajout d'articles
        val article1 = Article(1, "Titre 1", "Contenu 1")
        val article2 = Article(2, "Titre 2", "Contenu 2")
        databaseHelper.addArticle(article1.title, article1.content)
        databaseHelper.addArticle(article2.title, article2.content)

        // Récupération de tous les articles
        val articles = databaseHelper.getAllArticles()
        for (article in articles) {
            println("ID: ${article.id}, Titre: ${article.title}, Contenu: ${article.content}")
        }

        // Récupération d'un article par son ID
        val retrievedArticle = databaseHelper.getArticleById(1)
        retrievedArticle?.let {
            println("com.oumarleytisapplication.app.Article récupéré - ID: ${it.id}, Titre: ${it.title}, Contenu: ${it.content}")
        }

        // Mise à jour d'un article
        retrievedArticle?.let {
            it.title = "Nouveau titre"
            it.content = "Nouveau contenu"
            databaseHelper.updateArticle(it)
        }

        // Suppression d'un article
        val articleToDelete = databaseHelper.getArticleById(2)
        articleToDelete?.let {
            databaseHelper.deleteArticle(it)
        }

        // Vérification après suppression
        val remainingArticles = databaseHelper.getAllArticles()
        for (article in remainingArticles) {
            println("ID: ${article.id}, Titre: ${article.title}, Contenu: ${article.content}")
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        databaseHelper.close()
    }
}
