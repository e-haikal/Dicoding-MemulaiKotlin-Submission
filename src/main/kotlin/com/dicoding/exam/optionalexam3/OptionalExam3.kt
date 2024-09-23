package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    // Check if the string contains any digits
    for (char in str) {
        if (char.isDigit()) {
            // Found a digit, extract the number from the string
            val numberString = str.filter { it.isDigit() }
            val numberInString = numberString.toInt()

            // Calculate the new number by multiplying
            val newNumber = numberInString * int

            // Replace the old number in the string with the new number
            return str.replace(numberString, newNumber.toString())
        }
    }

    // If no digits are found, concatenate the integer to the string
    return str + int
}
