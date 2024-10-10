package com.example.latihan


fun ContohList() {
    println("=== List ===")
    // List Read-Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    //List Mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    //Menambahkan data ke dalam List Mutable
    shape.add("Circle")
    println(shape)

    // Menghapus data dari List Muutable
    shape.remove("Triangle")
    println(shape)

    //Mengubah data
    shape[0] = "Oval"
    println(shape)

    //List Read Only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}

fun ContohSet(){
    println()
    println("=== Set ===")

    // set read only
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

    // set mutable
    val shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
    println(shape)

    //Menambah Data
    shape.add("Rectangle")
    println(shape)

    //Menghapus
    shape.remove("Circle")
    println(shape)

    //set read-only
    val shapesLocked: Set<String> = shape
    println(shapesLocked)
}


