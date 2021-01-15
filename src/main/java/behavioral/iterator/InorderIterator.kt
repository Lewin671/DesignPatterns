package behavioral.iterator

class InorderIterator<T : Comparable<T>>(tree: BinaryTree<T>) : Iterator<T> {

    private val list = ArrayList<T>()
    var iterator: Iterator<T>

    init {
        inOrder(tree.root)
        iterator = list.iterator()
    }

    override fun hasNext(): Boolean {
        return iterator.hasNext()
    }

    override fun next(): T {
        return iterator.next()
    }

    private fun inOrder(root: Node<T>?) {
        root?.let {
            inOrder(root.left)
            list.add(root.data)
            inOrder(root.right)
        }
    }

}