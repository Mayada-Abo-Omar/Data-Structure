public class Array {
    private int[] items;
    private int count;

    public Array(int size) {
        items = new int[size];
        count = 0;
    }

    // Append
    public void append(int item) {
        if (count == items.length) {
            System.out.println("Array is Full");
            return;
        }
        items[count] = item;
        count++;
    }

    // Traverse
    public void traverse() {
        if (count == 0) {
            System.out.println("Array is Empty");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.print(items[i] + " ");
        }
    }

    // Linear Search
    public int linearSearch(int target) {
        for (int i = 0; i < count; i++) {
            if (items[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Insert
    public void insert(int item, int index) {
        if (count == items.length) {
            System.out.println("Array is Full");
            return;
        }
        for (int i = count - 1; i >= index; i--) {
            items[i + 1] = items[i];
        }
        items[index] = item;
        count++;
    }

    // Delete
    public void delete(int index) {
        if (count == 0) {
            System.out.println("Array is Empty");
            return;
        }
        for (int i = index; i < count - 1; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    // Get Count
    public int getCount() {
        return count;
    }

    // Get Items
    public int[] getItems() {
        return items;
    }
}