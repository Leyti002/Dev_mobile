package com.oumarleytisapplication.app.modules.home.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.oumarleytisapplication.app.R
import com.oumarleytisapplication.app.appcomponents.base.BaseActivity
import com.oumarleytisapplication.app.databinding.ActivityHomeBinding
import com.oumarleytisapplication.app.modules.addarticleform.ui.AddArticleFormActivity
import com.oumarleytisapplication.app.modules.articledetails.ui.ArticleDetailsActivity
import com.oumarleytisapplication.app.modules.home.`data`.viewmodel.HomeVM
import kotlin.String
import kotlin.Unit

class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {
  private val viewModel: HomeVM by viewModels<HomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearArticleitem5.setOnClickListener {
      val destIntent = ArticleDetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearArticleitem.setOnClickListener {
      val destIntent = ArticleDetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.floatingBtnFloatingactionbutton.setOnClickListener {
      val destIntent = AddArticleFormActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearArticleitem4.setOnClickListener {
      val destIntent = ArticleDetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearArticleitem3.setOnClickListener {
      val destIntent = ArticleDetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearArticleitem2.setOnClickListener {
      val destIntent = ArticleDetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearArticleitem1.setOnClickListener {
      val destIntent = ArticleDetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "HOME_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
