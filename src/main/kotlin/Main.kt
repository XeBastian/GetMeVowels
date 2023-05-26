////a program to check the vowels at a specific range of characters in the alphabet

fun main() {
//    here we assign a variale to our function call
//    improvement is to get the charachter range in the console.
    print("Enter the starting Character:   ")

    val start = readLine()!!.toString()[0]
    print("Enter the end Character:   ")
    val end = readLine()!!.toString()[0]

    val vowels = getCharacters(start, end)
    //print to get the values from the function
    println(vowels)
}

fun getCharacters(start: Char, end: Char): MutableList<Char> {
//    1. first we need the vowels array:
    var vowelsArray = mutableListOf<Char>('a', 'e', 'i', 'o', 'u')
//    2 we need the array which has the start and end charachers that the user provides
    var userRangeArray = (start..end).toMutableList()
//    3. we need an empty array which will be returned after adding the vowels.
    var returnedVowels = mutableListOf<Char>() //this needs to be empty

//    4 the operation to loop through the vowelsArray and check if any of the vowels are in the userArray then add to the empty array
    vowelsArray.forEach {
        if (it in userRangeArray) {
            returnedVowels.add(it)
        }
    }

    return returnedVowels
}













