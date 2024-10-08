package com.selva.shoppinglist20.data

import android.content.ContentProvider
import android.content.ContentValues
import android.content.UriMatcher
import android.database.Cursor
import android.net.Uri
import android.util.Log

class ShopListProvider: ContentProvider() {

    private val uriMatcher = UriMatcher(UriMatcher.NO_MATCH).apply {
        addURI("com.selva.shoppinglist20", "shop_items", GET_SHOP_ITEMS_QUERY)
    }

    override fun onCreate(): Boolean {
        return true
    }

    override fun query(
        p0: Uri,
        p1: Array<out String>?,
        p2: String?,
        p3: Array<out String>?,
        p4: String?
    ): Cursor? {
        val code = uriMatcher.match(p0)
        when (code) {
//            GET_SHOP_ITEMS_QUERY ->
        }
        Log.d("ShopListProvider", "query $p0")
        return null
    }

    override fun getType(p0: Uri): String? {
        TODO("Not yet implemented")
    }

    override fun insert(p0: Uri, p1: ContentValues?): Uri? {
        TODO("Not yet implemented")
    }

    override fun delete(p0: Uri, p1: String?, p2: Array<out String>?): Int {
        TODO("Not yet implemented")
    }

    override fun update(p0: Uri, p1: ContentValues?, p2: String?, p3: Array<out String>?): Int {
        TODO("Not yet implemented")
    }

    companion object {

        private const val GET_SHOP_ITEMS_QUERY = 100
    }
}