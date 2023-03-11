public class BinarySearchTree {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();
        bst.add(56);
        bst.add(30);
        bst.add(70);
        System.out.println("Size of BST: " + bst.size());
    }
}

class MyBinarySearchTree<K extends Comparable<K>> {
    MyBinaryNode<K> root;

    public MyBinarySearchTree() {
        this.root = null;
    }

    public void add(K key) {
        this.root = addRecursive(root, key);
    }

    private MyBinaryNode<K> addRecursive(MyBinaryNode<K> current, K key) {
        if (current == null) {
            return new MyBinaryNode<>(key);
        }
        if (key.compareTo(current.key) < 0) {
            current.left = addRecursive(current.left, key);
        } else if (key.compareTo(current.key) > 0) {
            current.right = addRecursive(current.right, key);
        }
        return current;
    }

    public int size() {
        return sizeRecursive(root);
    }

    private int sizeRecursive(MyBinaryNode<K> node) {
        if (node == null) {
            return 0;
        }
        return 1 + sizeRecursive(node.left) + sizeRecursive(node.right);
    }
}

class MyBinaryNode<K extends Comparable<K>> {
    K key;
    MyBinaryNode<K> left;
    MyBinaryNode<K> right;

    public MyBinaryNode(K key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}


