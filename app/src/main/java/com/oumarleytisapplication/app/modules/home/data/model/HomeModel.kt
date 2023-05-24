package com.oumarleytisapplication.app.modules.home.`data`.model

import com.oumarleytisapplication.app.R
import com.oumarleytisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSimpleBlog: String? = MyApp.getInstance().resources.getString(R.string.lbl_simpleblog)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArticleCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_article_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_is)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArticleCounterOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_article_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_is)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArticleCounterTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_article_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_is)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArticleCounterThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_article_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_is)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArticleCounterFour: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_article_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_is)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArticleCounterFive: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_article_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionFive: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_is)

)
