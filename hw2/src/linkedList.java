public class linkedList {

    private Node root; // стартовая node (root)
    private int size; // размер

    public void add(int value) {
        if (root == null) {
            root = new Node(value);
            size = 1;
            return;
        }
        Node currentNode = root;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new Node(value);
        size++;
    }

    public void revert() {
        if (root != null && root.next != null) {
            revert(root.next, root);
        }
    }

    private void revert(Node currentNode, Node previousNode) {
        if (currentNode.next == null) {
            root = currentNode;
        } else {
            revert(currentNode.next, currentNode);
        }
        currentNode.next = previousNode;
        previousNode.next = null;
    }

    public void print() {
        Node currentNode = root;
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
    }

    private class Node {
        int value;
        Node next;

        Node() {
        }

        Node(int _value) {
            this.value = _value;
        }

        Node(int _value, Node _next) {
            this.value = _value;
            this.next = _next;
        }
    }
}
