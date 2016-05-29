package com.stvjbz.masterdetailflow.data

import java.util.ArrayList
import java.util.HashMap

/**
 * Created by stvjbz on 16/05/29.
 */
object DummyContent {

    val ITEMS: MutableList<DummyItem> = ArrayList()

    val ITEM_MAP: MutableMap<String, DummyItem> = HashMap()

    val COUNT = 25

    init {
        // Add some sample items.
        for (i in 1..COUNT) {
            addItem(createDummyItem(i))
        }
    }

    private fun addItem(item: DummyItem) {
        ITEMS.add(item)
        ITEM_MAP.put(item.id, item)
    }

    private fun createDummyItem(position: Int): DummyItem {
        // String.valueOf(position), position.toString()は全く同じ。
        // 歴史的経緯により同じことが出来るメソッドが２つあるだけ。
        return DummyItem(position.toString(), "Item " + position, makeDetails(position))
    }

    private fun makeDetails(position: Int): String {
        val builder = StringBuilder()
        builder.append("Details about Item: ").append(position)
        for (i in 0..position - 1) {
            builder.append("\nMore details information here.")
        }
        return builder.toString()
    }

    class DummyItem(val id: String, val content: String, val details: String) {

        override fun toString(): String {
            return content
        }
    }
}
