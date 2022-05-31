package com.module.jetpack.compose.common.di

import android.content.Context
import androidx.compose.runtime.compositionLocalOf

interface CommonProvider {
    val context: Context //application context
}

val LocalCommonProvider = compositionLocalOf<CommonProvider> { error("No common provider found!") }