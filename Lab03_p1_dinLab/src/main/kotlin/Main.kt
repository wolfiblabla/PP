import java.awt.event.FocusEvent.Cause

class Birth(val year: Int, val Month: Int, val Day: Int){
    override fun toString() : String{
        return "($Day.$Month.$year)"
    }
}
class Contact(val Name: String, var Phone: String, val BirthDate: Birth){
    fun Print() {
        println("Name: $Name, Mobile: $Phone, Date: $BirthDate")
    }
    fun AbonamentOrange(tel : String) {
        Phone = tel
    }
}

fun Cautare(agenda : List<Contact>, tel : String) : Boolean {
    for (persoana in agenda) {
        if (persoana.Phone == tel) {
            return true
        }
    }
    return false
}
fun main(args : Array<String>){
    val agenda = mutableListOf<Contact>()
    agenda.add(Contact("Mihai", "0744321987", Birth(1900, 11, 25)))
    agenda += Contact("George", "0761332100", Birth(2002, 3, 14))
    agenda += Contact("Liviu" , "0231450211", Birth(1999, 7, 30))
    agenda += Contact("Popescu", "0211342787", Birth(1955, 5, 12))
    println("Persoana se afla in agenda: ${Cautare(agenda,"0231400211")}")
    agenda.get(2).AbonamentOrange("0759181157")
    agenda.get(2).Print()
    for (persoana in agenda){
        persoana.Print()
    }
    println("Agenda dupa eliminare contact [George]:")
    agenda.removeAt(1)
    for (persoana in agenda){
        persoana.Print()
    }
    agenda.remove(Contact("Liviu" , "0231450211", Birth(1999, 7, 30)))
    println("Agenda dupa eliminare contact [Liviu]:")
    agenda.removeAt(1)
    for (persoana in agenda){
        persoana.Print()
    }
}