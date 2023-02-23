package com.example.a00008.model

import java.io.Serializable

data class Model(
    val title:String,
    val price:String,
    val convert:String,
    var count: Int
): Serializable


data class NewsModel(
    val title: String?,
    val price: String?,
    val convert: String?,
    var count: Int
):Serializable


data class TenModel(
    val month: String,
    val kg: String
)