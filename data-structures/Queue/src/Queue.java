public class Queue {
    public Node first;
    public Node last;
    public int size;

    public Queue() {
        first = null;
        last = null;
        size = 0;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);

        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public Node dequeue() {
        if (first == null) return null;

        Node temp = first;

        if (first == last) {
            last = null;
        }
        first = first.next;

        return temp;
    }

    public int size() {
        return size;
    }
}
