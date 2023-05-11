enum class state {
    RUN, EXIT
}
fun main() {
    val start = "_________"
    val array = start.toCharArray()
    var count = 1
    var player: Char = 'X'

    fun printArray() {
        println(
            """
        ---------
        | ${array[0]} ${array[1]} ${array[2]} |
        | ${array[3]} ${array[4]} ${array[5]} |
        | ${array[6]} ${array[7]} ${array[8]} |
        ---------
    """.trimIndent()
        )
    }

    fun movie() {
        var leer = 0
        var X = 0
        var O = 0
        printArray()
        if (count % 2 == 0) {
            player = 'O'
        } else player = 'X'
        val (a, b) = readln().split(" ")
        if (a.toIntOrNull() != null && b.toIntOrNull() != null) {
            val c = a.toInt()
            val d = b.toInt()
            if (c in 1..3 && d in 1..3) {
                when (c) {
                    1 -> {
                        if (array[d - 1] == '_') {
                            array[d - 1] = player
                            count++
                        } else {
                            println("This cell is occupied! Choose another one!")
                        }
                    }

                    2 -> {
                        if (array[d + 2] == '_') {
                            array[d + 2] = player
                            count++
                        } else {
                            println("This cell is occupied! Choose another one!")
                        }
                    }

                    3 -> {
                        if (array[d + 5] == '_') {
                            array[d + 5] = player
                            count++
                        } else {
                            println("This cell is occupied! Choose another one!")
                        }
                    }

                    else -> {
                        println("You should enter numbers!")
                    }
                }
            } else {
                println("Coordinates should be from 1 to 3!")
            }
        } else {
            println("You should enter numbers!")
        }
        for (element in array) {
            if ( element == '_') {
                leer += 1
            }
        }

            for (i in array.indices step 3) { // ryad check
                if (array[i] == array[i + 1] && array[i] == array[i + 2]) {
                    when (array[i]){
                        'X' -> X += 1
                        'O' -> O += 1
                        else -> leer += 1
                    }
                }
            }
            for (i in 0..2) {   // kolonka
                if (array[i] == array[i + 3] && array[i] == array[i + 6]) {
                    when (array[i]){
                        'X' -> X += 1
                        'O' -> O += 1
                        else -> leer += 1
                    }
                }
            }

            if (array[0] == array[4] && array[0] == array[8]) {
                when {
                    array[0] == 'X' -> X += 1
                    array[0] == 'O' -> O += 1
                    else -> leer += 1
                }   // diagonal
            }
            if (array[2] == array[4] && array[2] == array[6]) {
                when {
                    array[2] == 'X' -> X += 1
                    array[2] == 'O' -> O += 1
                    else -> leer += 1
                }
            }

        if (leer > 0) {
            if (O == 1 && X == 0) {
                printArray()
                println("O wins")
                System.exit(-1)
            }
            if (X == 1 && O == 0) {
                printArray()
                println("X wins")
                System.exit(-1)
            }
            movie()
        } else {
            when {
                O == 1 && X == 0 -> {
                    printArray()
                    println("O wins")
                    System.exit(-1)
                }
                X == 1 && O == 0 -> {
                    printArray()
                    println("X wins")
                    System.exit(-1)
                }
                else -> {
                    printArray()
                    println("Draws")
                    System.exit(-1)
                }
            }
        }
    }
    movie()
    printArray()
}