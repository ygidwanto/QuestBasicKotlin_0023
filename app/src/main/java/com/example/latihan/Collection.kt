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

fun ContohMap(){

    println()
    println("=== Map ===")
    //Map Read-Only
    val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1,"Square" to 2,"Triangle" to 3)
    println(readOnlyShape)
    //Map Mutable
    val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    print(shape)
    // Menambah data ke mutable
    shape["Rectangle"] = 4
    println(shape)
    //menghapus data mutable
    shape.remove("Circle")
    println(shape)
    // Mengubah data mutable
    shape["Square"] = 5
    println(shape)
    // Map only
    val shapesLocked: Map<String, Int> = shape
    println(shapesLocked)
}


