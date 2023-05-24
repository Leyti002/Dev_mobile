import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.oumarleytisapplication.app.Article
import com.oumarleytisapplication.app.R

class ArticlesActivity : AppCompatActivity() {

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
}

class ArticleAdapter(private val articles: List<Article>) : RecyclerView.Adapter<ArticleAdapter.ArticleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_articles, parent, false)
        return ArticleViewHolder(view)
    }

    override fun getItemCount(): Int {
        return articles.size
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val article = articles[position]
        holder.bind()
    }

    inner class ArticleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind() {
            // Implémenter ici le code pour lier les données de l'article à l'élément de la liste
            // par exemple, définir le titre et le contenu de l'article dans les vues de l'élément
        }
    }
}
