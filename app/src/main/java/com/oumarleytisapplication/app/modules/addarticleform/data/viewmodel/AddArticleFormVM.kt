package com.oumarleytisapplication.app.modules.addarticleform.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oumarleytisapplication.app.modules.addarticleform.`data`.model.AddArticleFormModel
import org.koin.core.KoinComponent

class AddArticleFormVM : ViewModel(), KoinComponent {
  val addArticleFormModel: MutableLiveData<AddArticleFormModel> =
      MutableLiveData(AddArticleFormModel())

  var navArguments: Bundle? = null
}
