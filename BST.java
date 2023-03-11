public class BST {
    public static void main(String[] args) {
        MyBinaryNode<Integer> rootNode = new MyBinaryNode<>(56);
        rootNode.left = new MyBinaryNode<>(30);
        rootNode.right = new MyBinaryNode<>(70);
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

