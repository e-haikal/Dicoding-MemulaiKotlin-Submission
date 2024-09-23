package com.dicoding.exam.exam2

// TODO 1
fun calculate(valueA: Int, valueB: Int, valueC: Int?): Int {
    // Use 50 as default if valueC is null
    val effectiveC = valueC ?: 50
    return valueA + (valueB - effectiveC)
}

// TODO 2
fun result(result: Int): String {
    return "Result is $result"
}
