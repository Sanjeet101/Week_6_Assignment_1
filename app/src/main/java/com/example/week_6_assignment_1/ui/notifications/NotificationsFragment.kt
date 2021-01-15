package com.example.week_6_assignment_1.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.example.week_6_assignment_1.R

class NotificationsFragment : Fragment() {

    private lateinit var web: WebView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = layoutInflater.inflate(R.layout.fragment_notifications, container, false)
        web = view?.findViewById(R.id.web) as WebView
        web.webViewClient = WebViewClient()
        web.loadUrl("https://softwarica.edu.np/")
        val webSettings = web.settings
        webSettings.javaScriptEnabled = true
        webSettings.allowContentAccess = true
        webSettings.setAppCacheEnabled(true)
        webSettings.domStorageEnabled = true
        webSettings.useWideViewPort = true
        return view
    }
}