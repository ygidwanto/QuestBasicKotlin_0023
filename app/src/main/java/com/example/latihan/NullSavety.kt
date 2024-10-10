package com.example.latihan

fun nullSafety(){
    var neverNull: String = "This can't be null"
    var nullable: String? = "You can keep a null her e"
    nullable = null
    if (neverNull == null){
        println("inferredNull is null")
    }else {
        println("inferredNonNull us not null")
    }
    println(neverNull.length) // 18
    println(nullable?.length) // null
    fun strLength(notNull: String): Int {
        return notNull.length
    }
    println(strLength(neverNull))// 18
}
fun main() {
    nullSafety()
}