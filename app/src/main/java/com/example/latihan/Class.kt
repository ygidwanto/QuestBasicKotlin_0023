package com.example.latihan

class Motor()

class Contact(val id: Int, var email: String)

fun main() {
val contact = Contact(1,"mary@gmail.com")

    // Print the value of the property: Email
    println(contact.email)


    //update the value of the property: Email
    contact.email = "jane@gmail.com"

    //Prints the new value of the property: email
    println(contact.email)
}