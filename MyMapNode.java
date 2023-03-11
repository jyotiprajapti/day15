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

                LinkedList<MyMapNode>[] hashTable = new LinkedList[1000];
                String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
                String[] words2 = paragraph.split("[\\s,;:.!?]+");
                for (String word : words2) {
                    int hashCode = word.hashCode() % hashTable.length;
                    if (hashCode < 0) {
                        hashCode += hashTable.length;
                    }
                    if (hashTable[hashCode] == null) {
                        hashTable[hashCode] = new LinkedList<>();
                    }
                    boolean found = false;
                    for (MyMapNode node : hashTable[hashCode]) {
                        if (node.key.equals(word)) {
                            node.value++;
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        hashTable[hashCode].add(new MyMapNode(word, 1));
                    }
                }
                for (LinkedList<MyMapNode> list : hashTable) {
                    if (list != null) {
                        for (MyMapNode node : list) {
                            System.out.println(node.key + ": " + node.value);
                        }
                    }
                }
            }
        }