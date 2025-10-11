package com.isabel.medicaldictionary.ui.main

import android.content.Context
import android.content.SharedPreferences

object FavoritesManager {
    private const val PREFS_NAME = "favorites_prefs"
    private const val KEY_FAVORITES = "favorites_set"

    private fun getPrefs(context: Context): SharedPreferences {
        return context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    }

    fun getFavorites(context: Context): Set<String> {
        return getPrefs(context).getStringSet(KEY_FAVORITES, emptySet()) ?: emptySet()
    }

    fun isFavorite(context: Context, diseaseName: String): Boolean {
        return getFavorites(context).contains(diseaseName)
    }

    fun addFavorite(context: Context, diseaseName: String) {
        val prefs = getPrefs(context)
        val current = getFavorites(context).toMutableSet()
        current.add(diseaseName)
        prefs.edit().putStringSet(KEY_FAVORITES, current).apply()
    }

    fun removeFavorite(context: Context, diseaseName: String) {
        val prefs = getPrefs(context)
        val current = getFavorites(context).toMutableSet()
        current.remove(diseaseName)
        prefs.edit().putStringSet(KEY_FAVORITES, current).apply()
    }
}
