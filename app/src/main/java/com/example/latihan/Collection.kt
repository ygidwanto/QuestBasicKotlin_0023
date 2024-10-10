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


