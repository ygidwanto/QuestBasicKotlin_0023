package com.example.latihan

import android.provider.ContactsContract.Data

data class DataClass(
    val id: Int,
    var email: String
)

fun main(){
    val data = DataClass(1, "indra@gmail.com")
    println(data)
    // fun equals
    val data2 = DataClass(1, "makan@gmail.com")
    println(data == data2) // false
    // fun copy
    val data3 = data.copy()
    println(data3)
    //fun copy perubahan
    val data4 = data.copy(email = "sahar@gmail.com")
    println(data4)
}