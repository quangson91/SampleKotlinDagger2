package com.vnzit.sampledagger.repository

import com.vnzit.sampledagger.model.Item

import java.util.ArrayList

/**
 * Created by quangson8128 on 2/15/16.
 */
class Api {
    val timeCreated: Long

    init {
        this.timeCreated = System.currentTimeMillis()
    }

    val allItem: List<Item>
        get() = getItems(10)

    fun findOne(): Item {
        return genItem()
    }


    private fun getItems(count: Int): List<Item> {
        val result = ArrayList<Item>()
        for (i in 0..count - 1) {
            result.add(genItem())
        }
        return result
    }

    private fun genItem(): Item {
        return Item("title", "content")
    }
}
