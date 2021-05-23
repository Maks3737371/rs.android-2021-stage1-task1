package subtask1

class HappyArray
{
    fun convertToHappy(sadArray: IntArray): IntArray
    {
        val happyArray = sadArray.toMutableList()
        var i = 0
        while (i<happyArray.size-1) {
            if (i>0 && happyArray[i]>happyArray[i-1]+happyArray[i+1]){
                happyArray.removeAt(i)
                i--
            } else i++
        }
        return happyArray.toIntArray()
        //throw NotImplementedError("Not implemented")
    }
}