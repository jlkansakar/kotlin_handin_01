package com.example.otlin_handin_01

fun main() {
    ageVerify()
    getMax(1, 18, -5)
    getMin(1, 18, -5)
    getAvg(listOf(1,2,3,4,5,6,7,8,9,10,20,45))
    println(cprCheck("0102031999"))
    println(cprCheck("2113031999"))
    fizzBuzz(listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30))
}

fun ageVerify() {
    print("Please enter your age (as a number): ")
    val age = readln().toInt()
    if (age >= 18) {
        println("You are eligible to vote")
    }
    else {
        println("You are *not* eligible to vote")
    }
}

fun getMax(a: Int, b: Int, c: Int): Int {
    val numberList = listOf<Int>(a, b, c)
    var numMax: Int = numberList[0] // had to be initialised, so used numberList[0] as init value.
    for (number in numberList) {
        if (number > numMax) {
            numMax = number
        }
    }
    println("The biggest number is $numMax")
    return numMax
}

fun getMin(a: Int, b: Int, c: Int): Int {
    val numberList: List<Int> = listOf<Int>(a, b, c)
    var numMin: Int = numberList[0] // had to be initialised, so used numberList[0] as init value.
    for (number in numberList) {
        if (number < numMin) {
            numMin = number
        }
    }
    println("The smallest number is $numMin")
    return numMin
}


fun getAvg(numbers: List<Int>): Int {
    val sum: Int = numbers.sum()
    val listAvg: Int = sum/numbers.size
    println("The average of the numbers is $listAvg")
    return listAvg
}

fun cprCheck(cpr: String): Boolean {

    val cprDay: Int = cpr.substring(0, 2).toInt()
    val cprMonth: Int = cpr.substring(2, 4).toInt()
    if (cpr.length != 10) {
        return false
    }
    if (cprDay !in 1..31) {
        return false
    }
    if (cprMonth !in 1..12) {
        return false
    }
    return true
}

fun fizzBuzz(numbers: List<Int>){
    for (number in numbers) {
        if (number % 3 == 0 && number % 5 == 0) {
            println("$number = fizzbuzz")
        } else if (number % 3 == 0) {
            println("$number = fizz")
        } else if (number % 5 == 0) {
            println("$number = buzz")
        }
    }
}