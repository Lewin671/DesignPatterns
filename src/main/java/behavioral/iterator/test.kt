package behavioral.iterator

fun main() {
    val tree = BinaryTree<Int>()

    listOf(2, 5, 1, 3, 4).forEach {
        tree.insert(it)
    }

    val iterator = tree.iterator()

    while (iterator.hasNext()) {
        println(iterator.next())
    }

}