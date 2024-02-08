package com.example.otlin_handin_01

fun main() {
    ageVerify()
    getMax(1, 18, -5)
    getMin(1, 18, -5)
    getAvg(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 45))
    println(cprCheck("0102031999"))
    println(cprCheck("2113031999"))
    fizzBuzz(
        listOf(
            1,
            2,
            3,
            4,
            5,
            6,
            7,
            8,
            9,
            10,
            11,
            12,
            13,
            14,
            15,
            16,
            17,
            18,
            19,
            20,
            21,
            22,
            23,
            24,
            25,
            26,
            27,
            28,
            29,
            30
        )
    )
    nameShortener("Jonathan Lind Kansakar")
    gradeDecider(82)
    filterWordsByLength(mutableListOf<String>("Hej", "Du er Sej", "Dø"))
}

// Assignment 1
fun ageVerify() {
    print("Please enter your age (as a number): ")
    val age = readln().toInt()
    if (age >= 18) {
        println("You are eligible to vote")
    } else {
        println("You are *not* eligible to vote")
    }
}

// Assignment 2
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

// Assignment 2
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

// Assignment 3
fun getAvg(numbers: List<Int>): Int {
    val sum: Int = numbers.sum()
    val listAvg: Int = sum / numbers.size
    println("The average of the numbers is $listAvg")
    return listAvg
}

// Assignment 4
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

// Assignment 5
fun fizzBuzz(numbers: List<Int>) {
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

// Assignment 6
fun nameShortener(name: String) {
    val fullName: String = name
    val splitNames: List<String> = fullName.split(" ")
    val firstName: Char = splitNames[0].first()
    val middleName: Char = splitNames[1].first()
    val lastName = splitNames.last()

    println("$firstName.$middleName. $lastName")
}

// Assignment 7
fun gradeDecider(grade: Int) {
    when (grade) {
        in 90..100 -> {
            println("A")
        }

        in 80..89 -> {
            println("B")
        }

        in 70..79 -> {
            println("C")
        }

        in 60..69 -> {
            println("D")
        }

        else -> {
            println("F")
        }
    }
}

// Assignment 8
fun filterWordsByLength(words: MutableList<String>): MutableList<String> {
    val filteredWords: MutableList<String> = words.filter { it.length >= 3 }.toMutableList()
    println(filteredWords)
    return filteredWords
}