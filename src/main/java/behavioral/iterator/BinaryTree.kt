package behavioral.iterator

class BinaryTree<T : Comparable<T>>(override var size: Int = 0) : Collection<T> {

    var root: Node<T>? = null

    override fun contains(element: T): Boolean {
        iterator().forEach {
            if (it == element) {
                return true
            }
        }
        return false
    }

    override fun containsAll(elements: Collection<T>): Boolean {
        for (element in elements) {
            if (!contains(element)) {
                return false
            }
        }
        return true
    }

    override fun isEmpty(): Boolean = size == 0

    // 返回一个中序遍历的迭代器
    override fun iterator(): Iterator<T> {
        return InorderIterator<T>(this)
    }

    // 这里是按照二叉查找树的方式插入元素
    fun insert(data: T) {
        if (root == null) {
            root = Node(data)
        } else {
            var p = root
            while (p != null) {
                if (p.data > data) {
                    if (p.left != null) {
                        p = p.left
                    } else {
                        p.left = Node(data)
                        break
                    }
                } else {
                    if (p.right != null) {
                        p = p.right
                    } else {
                        p.right = Node(data)
                        break
                    }
                }
            }
        }

        size++
    }
}

class Node<T>(val data: T) {
    var left: Node<T>? = null
    var right: Node<T>? = null
}