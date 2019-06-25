package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textview)
        val integer = 1

        textView.erroringDrawableExtensionMethod(R.drawable.ic_launcher_background, 2f)
        nonErroringMethod(R.drawable.ic_launcher_background, 2f)

        integer.errorExtensionMethod(1, null)
        integer.errorExtensionMethodWithDrawableAnnotation(R.drawable.ic_launcher_background, 1)
        integer.errorExtensionMethodWithColorAnnotation(R.color.abc_background_cache_hint_selector_material_dark, 1)

        textView.erroringDrawableExtensionMethodForView(R.drawable.ic_launcher_background, 2f)
    }
}
