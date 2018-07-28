package example

import org.rythmengine.Rythm
import java.io.File

fun main(args: Array<String>) {
    val items = listOf(
            Item("Item 1", "$19.99", listOf("good", "item", "new"), listOf(Feature("New!"), Feature("Awesome!"))),
            Item("Item 2", "$29.99", listOf("old", "item", "bad"), listOf(Feature("Old."), Feature("Ugly.")))
    )
    System.out.println(Rythm.render(File("src/main/resources/rythm/hello.rythm"), items))
}


class Feature(val description: String)

class Item(val name: String, val price: String, val keywords: List<String>, val features: List<Feature>)