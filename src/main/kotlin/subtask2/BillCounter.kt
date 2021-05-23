package subtask2

class BillCounter {

    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val generalBill = (bill.sum()-bill[k])/2
        if (generalBill == b) {
            return "Bon Appetit"
        }
        else
            return (b - generalBill).toString()
        //throw NotImplementedError("Not implemented")
    }
}
