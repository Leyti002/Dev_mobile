package com.oumarleytisapplication.app.modules.addarticleform.`data`.model

import com.oumarleytisapplication.app.R
import com.oumarleytisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AddArticleFormModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSimpleBlog: String? = MyApp.getInstance().resources.getString(R.string.lbl_simpleblog)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAjouterunarti: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ajouter_un_arti)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_titre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContenu: String? = MyApp.getInstance().resources.getString(R.string.lbl_contenu)

)
