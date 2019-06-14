public class MaxBinaryHeap {
    private int[] Heap;
    private int size;
    private int maxSize;

    public MaxBinaryHeap(int maxSize){
        this.maxSize = maxSize;
        this.size = 0;
        Heap = new int[this.maxSize + 1];
        Heap[0] = Integer.MAX_VALUE;
    }

    public int parent(int index){
        return index / 2;
    }

    public int leftChild(int index){
        return (2 * index);
    }

    public int rightChild(int index){
        return (2 * index) + 1;
    }

    public boolean isLeaf(int position){
        if (position >= (size / 2) && position <= size){
            return true;
        }
        return false;
    }

    public void swap(int first, int second){
        int temp;
        temp = Heap[first];
        Heap[first] = Heap[second];
        Heap[second] = temp;
    }

    public void maxHeapify(int position){
        if (isLeaf(position)) return;

        if (Heap[position] < Heap[leftChild(position)] || Heap[position] < Heap[rightChild(position)]) {
            if (Heap[leftChild(position)] > Heap[rightChild(position)]) {
                swap(position, leftChild(position));
                maxHeapify(leftChild(position));
            } else {
                swap(position, rightChild(position));
                maxHeapify(rightChild(position));
            }
        }
    }

    public void insert(int element) {
        Heap[++size] = element;

        int current = size;
        while (Heap[current] > Heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public int extractMax(){
        int poppedElement = Heap[1];
        Heap[1] = Heap[size--];

        return poppedElement;
    }

    public static void main(String[] args) {

    }


}
