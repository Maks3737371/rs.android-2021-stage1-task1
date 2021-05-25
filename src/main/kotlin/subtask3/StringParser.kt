package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val tempArray :MutableList<String> = mutableListOf()
        for (i in inputString.indices)
        {
            when (inputString[i])
            {
                '(' -> tempArray.add(findSubstring(inputString, '(', ')', i))
                '[' -> tempArray.add(findSubstring(inputString, '[', ']', i))
                '<' -> tempArray.add(findSubstring(inputString, '<', '>', i))
            }
        }
        return tempArray.toTypedArray()
    }

    private fun findSubstring(string: String, openBracket: Char, closeBracket: Char, index: Int): String{
        var subString: String = ""
        var subStrIndex=index+1
        var counter = 0

        while(string[subStrIndex]!=closeBracket || counter>0)
        {
            if (string[subStrIndex]==openBracket)
                counter++
            else
                if (string[subStrIndex]==closeBracket)
                counter--
            subString += string[subStrIndex]
            subStrIndex++
        }
        return subString
    }
}
