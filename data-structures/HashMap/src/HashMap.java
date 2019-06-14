import java.nio.charset.StandardCharsets;

public class HashMap {

    public int Prime = 599;
    public int Buckets;
    public LinkedListt[] HashMap = new LinkedListt[1024];

    public HashMap() {

    }

    public static void main(String[] args) {

    }

    public boolean add(String key, Object value){
        try {
            int bucket = hash(key);
            Node newNode = new Node(value) {Key = key};

            if (HashMap[bucket] == null){
                HashMap[bucket] = new LinkedListt(newNode);
            } else if (find(key) == null){
                HashMap[bucket] = new LinkedListt(newNode);
            } else{
                findNode(key).Value = value;
            }
            return true;
        } catch (Exception ex){
            return false;
        }
    }

    public Object find(String key){
        int bucket = hash(key);

        if (HashMap[bucket] != null){
            Node current = HashMap[bucket].head;

            while (current != null){
                if ((String)current.Key == key) return current.Value;
                current = current.next;
            }
        }
        return null;
    }

    public Node findNode(String key){
        int bucket = hash(key);

        Node current = HashMap[bucket].head;

        while (current != null){
            if ((String)current.Key == key) return current;
            current = current.next;
        }


        return null;
    }

    public int hash(String key){
        byte[] bytes = key.getBytes(StandardCharsets.US_ASCII);
        int asciiVal = 0;

        for (int i = 0; i < bytes.length; i++) {
            asciiVal += bytes[i];
        }

        int bucket = (asciiVal * Prime) % HashMap.length;

        return bucket;

    }
}
