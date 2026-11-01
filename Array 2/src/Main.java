public class Main {
    public static void main(String[] args) {
        Array arr = new Array(5);
        // Append
        arr.append(10);
        arr.append(20);
        arr.append(30);
        System.out.println("After Append:");
        arr.traverse();
        // Insert
        arr.insert(15, 1);
        System.out.println("After Insert:");
        arr.traverse();
        // Linear Search
        int index = arr.linearSearch(20);
        System.out.println("Search Result: " + index);
        // Delete
        arr.delete(2);
        System.out.println("After Delete:");
        arr.traverse();
        System.out.println("Count: " + arr.getCount());
    }
}