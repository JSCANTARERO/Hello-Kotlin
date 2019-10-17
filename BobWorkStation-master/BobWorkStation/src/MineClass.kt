
open class MineClass
{
    var total = 0
    val bank = BankClass()
    val taver = TavernClass()
    val home = HomeSweetHomeClass()


         open fun GoldPocketFun(OroBolsa: Int): Int
        {
           // var totalOro: Int
            if(OroBolsa < 3) {
                val Oro = OroBolsa
                return Oro + 1
            }else{
                //Here Bob Must Go to the Bank
                total = bank.GoldBank(OroBolsa)
                return OroBolsa - OroBolsa
            }
        }



         open fun ThristyFun(Sed : Int): Int
        {
            if (Sed < 5)
            {
                val Sediento = Sed
                return Sediento + 1
            }else
            {
                //Here Bob Must go to the Tabern
                return taver.tavern(Sed)
            }

        }

         open fun FatigueFun(Fatigue : Int): Int
         {
             if (Fatigue < 10)
             {
                 val Fatiga = Fatigue
                 return Fatiga + 2
             } else
             {
                 //Here Bob Must go to Home Sweet Home
                 return home.Home(Fatigue)
             }
         }


    open fun FatigueFunBank(Fatigue : Int): Int
    {
        if (Fatigue < 8)
        {
            val Fatiga = Fatigue
            return Fatiga + 2
        } else
        {
            //Here Bob Must go to Home Sweet Home
            return home.Home(Fatigue)
        }
    }
}