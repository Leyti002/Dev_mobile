package com.oumarleytisapplication.app.modules.articledetails.`data`.model

import com.oumarleytisapplication.app.R
import com.oumarleytisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ArticleDetailsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtArticleCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_article_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEcritparJohn: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ecrit_par_john)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt21Novembre202: String? =
      MyApp.getInstance().resources.getString(R.string.msg_21_novembre_202)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_is_lorem_i)

)
