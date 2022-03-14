import java.io.File

fun main(args : Array<String>){
    val Dictionar = hashMapOf<String, String>(
        "Once" to "Odata",
        "upon" to "ca",
        "a" to "",
        "time" to "niciodata",
        "there" to "acolo",
        "was" to "a fost",
        "an" to "o",
        "old" to "batrana",
        "woman" to "femeie",
        "who" to "care",
        "loved" to "iubea",
        "baking" to "sa gateasca",
        "gingerbread" to "turta dulce",
        "She" to "Ea",
        "would" to "ar fi",
        "bake" to "gatit",
        "gingerbread" to "turta dulce",
        "cookies" to "biscuiti",
        "cakes" to "prajituri",
        "houses" to "case",
        "and" to "si",
        "people" to "oameni",
        "all" to "toti",
        "decorated" to "decorati",
        "with" to "cu",
        "chocolate" to "ciocolata",
        "peppermint" to "menta",
        "caramel" to "caramel",
        "candies" to "bomboane",
        "colored" to "colorate",
        "ingredients" to "ingrediente"
    )
    val fisier = File("src/main/resources/dictionar.txt")
    val cuvinte = mutableListOf<String>()

    fisier.forEachLine { cuvinte.add(it) }

    for (i in cuvinte.indices step 2) {
        Dictionar.put(cuvinte[i],cuvinte[i+1])
    }

    println(Dictionar)
    /* //1
    Dictionar.put("cow","vaca")
    println(Dictionar)
    */
    /*
    val Poveste = "Once upon a time there was an old woman who loved baking gingerbread. She would bake gingerbread cookies, cakes, houses and gingerbread people, all decorated with chocolate and peppermint, caramelcandies and colored ingredients."
    val words1 = Poveste.split(" ")
    println("Cuvintele din poveste [${words1.count()}]:")
    for (word in words1)
        print(word + " ")
    val words2 = mutableListOf<String>()
    for (word in words1){
        words2.add(word.trim(',','.'))
    }
    println("\n")
    println("Povestea tradusa ar suna cam asa:")
    val fisier = File("src/main/resources/traducere.txt")

    fisier.printWriter().use { out ->
        for (item in words2){
            if (Dictionar.contains(item))
                out.print(Dictionar[item])
            else
                out.print("[$item]")
            out.print(" ")
        }
    }
     */
}