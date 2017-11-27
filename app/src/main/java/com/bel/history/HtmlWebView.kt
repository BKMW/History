package com.bel.history

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_html__web_view.*

class HtmlWebView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_html__web_view)

        //===== get variable from intent category and it id =====//
        val  data=intent
        val subTitle=data.extras.getString("subTitle")
        val page=data.extras.getInt("page")+1
        //======== setTitle ======//
        title=subTitle
        //==== webView
        //page++
        webView.loadUrl("file:///android_asset/html/$page.html")
    }
}
