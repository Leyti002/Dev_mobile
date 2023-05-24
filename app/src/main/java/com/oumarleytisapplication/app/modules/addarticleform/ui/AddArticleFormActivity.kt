package com.oumarleytisapplication.app.modules.addarticleform.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.oumarleytisapplication.app.R
import com.oumarleytisapplication.app.appcomponents.base.BaseActivity
import com.oumarleytisapplication.app.databinding.ActivityAddArticleFormBinding
import com.oumarleytisapplication.app.modules.addarticleform.`data`.viewmodel.AddArticleFormVM
import com.oumarleytisapplication.app.modules.home.ui.HomeActivity
import kotlin.String
import kotlin.Unit

class AddArticleFormActivity :
    BaseActivity<ActivityAddArticleFormBinding>(R.layout.activity_add_article_form) {
  private val viewModel: AddArticleFormVM by viewModels<AddArticleFormVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addArticleFormVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.btnAjouter.setOnClickListener {
        val destIntent = HomeActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.floatingBtnFloatingactionbutton.setOnClickListener {
        val destIntent = HomeActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "ADD_ARTICLE_FORM_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, AddArticleFormActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
