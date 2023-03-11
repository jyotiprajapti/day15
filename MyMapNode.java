import java.util.LinkedList;

public class MyMapNode {
    String key;
    int value;

    public MyMapNode(String key, int value) {
        this.key = key;
        this.value = value;
    }
}
    class Main {
    public static void main(String[] args) {
        LinkedList<MyMapNode> linkedList = new LinkedList<>();
        String sentence = "To be or not to be";
        String[] words = sentence.split("[\\s,;:.!?]+");
        for (String word : words) {
            boolean found = false;
            for (MyMapNode node : linkedList) {
                if (node.key.equals(word)) {
                    node.value++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                linkedList.add(new MyMapNode(word, 1));
            }
        }
        for (MyMapNode node : linkedList) {
            System.out.println(node.key + ": " + node.value);
        }
    }
}

