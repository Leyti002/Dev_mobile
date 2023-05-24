package com.oumarleytisapplication.app.modules.articledetails.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.oumarleytisapplication.app.R
import com.oumarleytisapplication.app.appcomponents.base.BaseActivity
import com.oumarleytisapplication.app.databinding.ActivityArticleDetailsBinding
import com.oumarleytisapplication.app.modules.articledetails.`data`.viewmodel.ArticleDetailsVM
import com.oumarleytisapplication.app.modules.home.ui.HomeActivity
import kotlin.String
import kotlin.Unit

class ArticleDetailsActivity :
    BaseActivity<ActivityArticleDetailsBinding>(R.layout.activity_article_details) {
  private val viewModel: ArticleDetailsVM by viewModels<ArticleDetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.articleDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.floatingBtnFloatingactionbutton.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ARTICLE_DETAILS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ArticleDetailsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
