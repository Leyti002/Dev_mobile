package com.oumarleytisapplication.app

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_NAME = "samaBlog.db"
        private const val DATABASE_VERSION = 1

        private const val TABLE_NAME = "articles"
        private const val COLUMN_ID = "id"
        private const val COLUMN_TITLE = "title"
        private const val COLUMN_CONTENT = "content"
    }

    override fun onCreate(db: SQLiteDatabase) {
        val createTableQuery = "CREATE TABLE $TABLE_NAME ($COLUMN_ID INTEGER PRIMARY KEY, $COLUMN_TITLE TEXT, $COLUMN_CONTENT TEXT)"
        db.execSQL(createTableQuery)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        val dropTableQuery = "DROP TABLE IF EXISTS $TABLE_NAME"
        db.execSQL(dropTableQuery)
        onCreate(db)
    }

    fun addArticle(title: String, content: String): Long {
        val values = ContentValues()
        values.put(COLUMN_TITLE, title)
        values.put(COLUMN_CONTENT, content)

        val db = writableDatabase
        return db.insert(TABLE_NAME, null, values)
    }

    @SuppressLint("Range")
    fun getAllArticles(): ArrayList<Article> {
        val articles = ArrayList<Article>()

        val selectQuery = "SELECT * FROM $TABLE_NAME ORDER BY $COLUMN_ID DESC"
        val db = readableDatabase
        val cursor: Cursor? = db.rawQuery(selectQuery, null)

        cursor?.use {
            if (cursor.moveToFirst()) {
                do {
                    val id = cursor.getLong(cursor.getColumnIndex(COLUMN_ID))
                    val title = cursor.getString(cursor.getColumnIndex(COLUMN_TITLE))
                    val content = cursor.getString(cursor.getColumnIndex(COLUMN_CONTENT))

                    val article = Article(id, title, content)
                    articles.add(article)
                } while (cursor.moveToNext())
            }
        }

        return articles
    }

    @SuppressLint("Range")
    fun getArticleById(id: Long): Article? {
        val selectQuery = "SELECT * FROM $TABLE_NAME WHERE $COLUMN_ID = $id"
        val db = readableDatabase
        val cursor: Cursor? = db.rawQuery(selectQuery, null)

        var article: Article? = null

        cursor?.use {
            if (cursor.moveToFirst()) {
                val title = cursor.getString(cursor.getColumnIndex(COLUMN_TITLE))
                val content = cursor.getString(cursor.getColumnIndex(COLUMN_CONTENT))

                article = Article(id, title, content)
            }
        }

        return article
    }

    fun updateArticle(article: Article): Int {
        val values = ContentValues()
        values.put(COLUMN_TITLE, article.title)
        values.put(COLUMN_CONTENT, article.content)

        val db = writableDatabase
        val whereClause = "$COLUMN_ID = ?"
        val whereArgs = arrayOf(article.id.toString())

        return db.update(TABLE_NAME, values, whereClause, whereArgs)
    }

    fun deleteArticle(article: Article): Int {
        val db = writableDatabase
        val whereClause = "$COLUMN_ID = ?"
        val whereArgs = arrayOf(article.id.toString())

        return db.delete(TABLE_NAME, whereClause, whereArgs)
    }
}

class Article(val id: Long, var title: String, var content: String)
