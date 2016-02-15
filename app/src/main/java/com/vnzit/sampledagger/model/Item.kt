package com.vnzit.sampledagger.model

/**
 * Created by quangson8128 on 2/15/16.
 */
class Item {
    var title: String? = null
    var content: String? = null

    constructor(title: String, content: String) {
        this.title = title
        this.content = content
    }

    constructor() {
    }

    override fun toString(): String {
        return "Item{title='$title\', content='$content\'}"
    }
}
