package ro.roxana.tuiasi

import org.jsoup.Jsoup
import org.jsoup.select.Elements

class Post(val titlu: String, val link: String) {
    fun Print() {
        println("Titlul articolului: $titlu Link: $link")
    }
}

fun main() {
    val url = "http://rss.cnn.com/rss/edition.rss"
    val websiteHTML = Jsoup.connect(url).get()

    val links : Elements =  websiteHTML.select("rss channel item link")
    val titles : Elements =  websiteHTML.select("rss channel item title")

    val linksString = mutableListOf<String>()
    val titlesString = mutableListOf<String>()

    for (link in links) {
        val trim = link.toString()
        linksString.add(trim.substring(8,trim.length - 8))
    }

    for (title in titles) {
        val trim = title.toString()
        titlesString.add(trim.substring(16,trim.length - 11))
    }

    val postari = mutableListOf<Post>()
    titlesString.zip(linksString).forEach{
        val postare_noua = Post(it.component1(),it.component2())
        postari.add(postare_noua)
    }

    for (post in postari) {
        post.Print()
    }
}