public class LinkedListt {

    public Node head;
    public Node tail;
    public int length;

    public LinkedListt() {
        this.head = head;
        this.tail = tail;
        this.length = 0;
    }

    public LinkedListt(Node node){
        head = node;
    }

    public void addToBeginning(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public void addToEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        length++;
    }

    public Node removeFromBeginning() {
        if (head == null) return null;

        Node temp = head;
        head = head.next;
        length--;
        return temp;
    }

    public Node removeFromEnd() {
        if (head == null) return null;

        Node current = head;
        Node newTail = current;

        while (current.next != null) {
            newTail = current;
            current = current.next;
        }
        tail = newTail;
        tail.next = null;
        length--;

        if (length == 0) {
            head = null;
            tail = null;
        }
        return current;
    }

    public Node getNode(int index) {
        if (index >= length) return null;
        int count = 0;

        Node current = head;

        while (count != index) {
            current = current.next;
            count++;

        }
        return current;
    }

    public void insert(int index, int value) {
        Node newNode = new Node(value);

        if (index >= length) return;
        if (index == 0) addToBeginning(value);
        if (index == length) addToEnd(value);

        Node previous = getNode(index - 1);
        Node temp = previous.next;
        previous.next = newNode;
        newNode.next = temp;
        length++;
    }

    public void remove(int index) {
        if (index == 0) {
            removeFromBeginning();
        }
        if (index == length - 1) {
            removeFromEnd();
        }

        Node previous = getNode(index - 1);
        previous.next = previous.next.next;
        length--;
    }


}
