public class Stack {

    public Node first;
    public Node last;
    public int size;

    public Stack(){
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (first == null) {
            first = newNode;
            last = newNode;
        }

        Node temp = first;
        first = newNode;
        first.next = temp;
        size++;
        
    }

    public Node pop() {
        if (first == null) return null;

        Node temp = first;

        if (first == last) {
            last = null;
        }
        first = first.next;
        size--;
        return temp;
    }

    public int size() {
        return size;
    }
}
