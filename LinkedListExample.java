class LinkedListExample {

    public static void main(String[] args) {
        Node node = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);

        node.deleteCurrentNode(node3);
        System.out.println("Print after deleting current node ");
        node.printLinkedList(node);
    }
}

class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void printLinkedList(Node node) {
        while (node != null) {
            System.out.print(node.getData() + " ");
            node = node.getNext();
        }
    }

    public void deleteCurrentNode(Node node3) {
        int data=node3.getNext().getData();
        node3.setData(data);
        node3.next=node3.getNext().getNext();
    }
}
