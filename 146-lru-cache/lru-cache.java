class LRUCache {
    private int capacity;
    private Map<Integer, Node> cache;
    private Node head;
    private Node tail;
    
   class Node{
       int key;
       int value;
       Node prev;
       Node next;

       Node(int key, int value){
           this.key = key;
           this.value = value;
       }
   }
    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
        }
    private void removeNode(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    } 
    private void addToFront(Node node){
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        node.prev= head;
    }   
    
    public int get(int key) {
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            removeNode(node);
            addToFront(node);
            return node.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            node.value = value;
            removeNode(node);
            addToFront(node);
        }else{
            if(cache.size() >= capacity){
                Node tailPrev = tail.prev;
                removeNode(tailPrev);
                cache.remove(tailPrev.key);

        }
        Node newNode = new Node(key, value);
        cache.put(key, newNode);
        addToFront(newNode);
        }
        
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */