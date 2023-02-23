package pruebaPerson

class Person(cash : Int, retirement : Int, first : String, last : String):PersonInterface() {

    var cashSaving = 0

    var retirementFund = 0

    val firstName = first

    val lastName = last

    init {
        cashSaving = cash
        retirementFund = retirement
    }

    override fun computeTotalWealth(): Int {
        return cashSaving + retirementFund
    }

    override fun getName(): String {
        return firstName + " " + lastName
    }

}