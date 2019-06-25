package com.example.myapplication

import android.support.annotation.ColorRes
import android.support.annotation.DrawableRes
import android.util.Log
import android.view.View
import android.widget.TextView
import org.jetbrains.annotations.NotNull

fun TextView.erroringDrawableExtensionMethod(@DrawableRes drawableRes: Int, padding: Float) {
    Log.d("", drawableRes.toString())
    Log.d("", padding.toString())
}

fun View.erroringDrawableExtensionMethodForView(@DrawableRes drawableRes: Int, padding: Float) {
    Log.d("", drawableRes.toString())
    Log.d("", padding.toString())
}

fun Int.errorExtensionMethod(@NotNull arg1: Int, arg2: Int?) {
    Log.d("", arg1.toString())
    Log.d("", arg2.toString())
}

fun Int.errorExtensionMethodWithDrawableAnnotation(@DrawableRes drawableRes: Int, arg2: Int) {
    Log.d("", drawableRes.toString())
    Log.d("", arg2.toString())
}

fun Int.errorExtensionMethodWithColorAnnotation(@ColorRes drawableRes: Int, arg2: Int) {
    Log.d("", drawableRes.toString())
    Log.d("", arg2.toString())
}

fun nonErroringMethod(@DrawableRes drawableRes: Int, padding: Float) {
    Log.d("", drawableRes.toString())
    Log.d("", padding.toString())
}