package com.example.uakpicomsysio8203.ui.book

import com.fasterxml.jackson.annotation.JsonProperty

class BookContainer {
    @JsonProperty("books")
    var search: MutableList<Book> = ArrayList()
}
