package LruCache;

public class LRUCacheDemo {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        LRUCache<Integer, String> cache = new LRUCache<>(3);

        cache.put(1, "Value 1");
        cache.put(2, "Value 2");
        cache.put(3, "Value 3");

        System.out.println("Key: 1 " + "Value: " + cache.get(1)); // Output: Value 1
        System.out.println("Key: 2 " + "Value: " + cache.get(2)); // Output: Value 2

        cache.put(4, "Value 4");

        System.out.println("Key: 3 " + "Value: " + cache.get(3)); // Output: null
        System.out.println("Key: 4 " + "Value: " + cache.get(4)); // Output: Value 4

        cache.put(2, "Updated Value 2");

        System.out.println("Key: 1 " + "Value: " + cache.get(1)); // Output: Value 1
        System.out.println("Key: 2 " + "Value: " + cache.get(2)); // Output: Updated Value 2
    }
}
