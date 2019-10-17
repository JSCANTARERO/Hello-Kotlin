import jdk.nashorn.internal.ir.ReturnNode

open class BankClass() {
    //Quitar este
//var Gold = 0
    var Gold = 0
    open fun GoldBank(GoldPocket: Int): Int{
        // var
        var GoldAnterior = GoldPocket
        Gold = Gold + GoldAnterior
        return Gold
    }

/*
    fun Total(): Int{
        return Gold
    }
*/
}