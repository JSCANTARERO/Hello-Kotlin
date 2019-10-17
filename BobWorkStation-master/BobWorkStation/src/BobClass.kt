open class BobClass(var GoldPocket : Int,var Thirst : Int, var Fatigue: Int)
{
    open fun show(){
        println("\nOro en el bolsillo es de: $GoldPocket\nLa sed de Bob es de: $Thirst\n" +
                "La fatiga de Bob es de: $Fatigue\n")
    }
}