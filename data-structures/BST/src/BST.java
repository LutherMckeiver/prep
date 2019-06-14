import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BST {
    public Node root;

    public BST() {
        root = null;
    }

    public Node insertNode(int value) {
        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
            return root;
        } else {
            Node current = root;

            while (true) {
                if (root.value == current.value) return root;
                if (root.value < current.value) {
                    if (current.leftChild == null) {
                        current.leftChild = newNode;
                        return current.leftChild;
                    } else {
                        current = current.leftChild;
                    }
                } else if (root.value > current.value) {
                    if (current.rightChild == null) {
                        current.rightChild = newNode;
                        return current.rightChild;
                    } else {
                        current = current.rightChild;
                    }
                }
            }
        }

    }

    public Node findNode(Node root, int key) {
        if (root == null || root.value == key) return root;

        if (root.value > key) {
            return findNode(root.leftChild, key);
        }
        return findNode(root.rightChild, key);
    }

    public void BFS(Node root) {
        Queue<Node> queue = new LinkedList<Node>();

        if (root == null) return;

        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.remove();

            if (node.leftChild != null) {
                queue.add(node.leftChild);
            }
            if (node.rightChild != null) {
                queue.add(node.rightChild);
            }
        }
    }

    public List<Node> preOrder(Node root, List<Node> list){
        list.add(root);

        if (root.leftChild != null) {
            return preOrder(root.leftChild, list);
        }

        if (root.rightChild != null) {
            return preOrder(root.rightChild, list);
        }

        return list;
    }

    public List<Node> inOrder(Node root, List<Node> list){
        if (root.leftChild != null) {
            return inOrder(root.leftChild, list);
        }

        list.add(root);

        if (root.rightChild != null) {
            return inOrder(root.rightChild, list);
        }

        return list;
    }

    public List<Node> postOrder(Node root, List<Node> list) {
        if (root.leftChild != null) {
            return postOrder(root.leftChild, list);
        }

        if (root.rightChild != null) {
            return postOrder(root.rightChild, list);
        }

        list.add(root);

        return list;
    }


}
