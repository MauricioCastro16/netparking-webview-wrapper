package com.example.seminario_webviewwrapper

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import androidx.webkit.WebSettingsCompat
import androidx.webkit.WebViewFeature

class MainActivity : AppCompatActivity() {
    
    private lateinit var webView: WebView
    
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        // Configurar WebView
        webView = findViewById(R.id.webView)
        setupWebView()
        
        // Cargar la URL de la aplicación web
        webView.loadUrl("https://seminario-estacionamientos-3i3i.onrender.com/Account/Login")
    }
    
    @SuppressLint("SetJavaScriptEnabled")
    private fun setupWebView() {
        val webSettings: WebSettings = webView.settings
        
        // Habilitar JavaScript (necesario para la aplicación web)
        webSettings.javaScriptEnabled = true
        
        // Habilitar DOM storage (para localStorage/sessionStorage)
        webSettings.domStorageEnabled = true
        
        // Habilitar base de datos web
        webSettings.databaseEnabled = true
        
        // Habilitar geolocalización
        webSettings.setGeolocationEnabled(true)
        
        // Configurar user agent para mejor compatibilidad
        webSettings.userAgentString = webSettings.userAgentString + " SeminarioWebViewWrapper/1.0"
        
        // Habilitar zoom
        webSettings.setSupportZoom(true)
        webSettings.builtInZoomControls = true
        webSettings.displayZoomControls = false
        
        // Configurar cache
        webSettings.cacheMode = WebSettings.LOAD_DEFAULT
        
        // Habilitar contenido mixto (HTTP/HTTPS)
        if (WebViewFeature.isFeatureSupported(WebViewFeature.ALGORITHMIC_DARKENING)) {
            WebSettingsCompat.setAlgorithmicDarkeningAllowed(webSettings, true)
        }
        
        // Configurar WebViewClient para manejar navegación
        webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                // Permitir que WebView maneje todas las URLs
                return false
            }
            
            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                // La página ha terminado de cargar
            }
            
            override fun onReceivedError(view: WebView?, errorCode: Int, description: String?, failingUrl: String?) {
                super.onReceivedError(view, errorCode, description, failingUrl)
                // Manejar errores de carga si es necesario
            }
        }
    }
    
    override fun onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }
    
    override fun onDestroy() {
        super.onDestroy()
        webView.destroy()
    }
}