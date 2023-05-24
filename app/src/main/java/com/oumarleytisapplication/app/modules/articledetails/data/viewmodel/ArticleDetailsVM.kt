package com.oumarleytisapplication.app.modules.articledetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oumarleytisapplication.app.modules.articledetails.`data`.model.ArticleDetailsModel
import org.koin.core.KoinComponent

class ArticleDetailsVM : ViewModel(), KoinComponent {
  val articleDetailsModel: MutableLiveData<ArticleDetailsModel> =
      MutableLiveData(ArticleDetailsModel())

  var navArguments: Bundle? = null
}
