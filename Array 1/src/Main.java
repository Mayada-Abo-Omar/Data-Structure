public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        //The Operation : Traversal
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The element at index " + i + " : " + arr[i]);
        }
// The Operation : Linear Search
        int target = 30;
        int found = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = i;
                break;
            }
            System.out.println("The Element Found At Index : " + found);
        }

        // The Operation : Insertion
        int element = 25;
        int index = 2;
        int newArr[] = new int[arr.length + 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            } else if (i == index) {
                newArr[i] = element;
            } else {
                newArr[i] = arr[i - 1];
            }
            arr = newArr;
            System.out.println("After Insertion :");
            for ( i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "");
            }
        }
        // The Operation : Deletion
        index = 3;
        int[] deletArr = new int[arr.length - 1];
        for (int i = 0; i < deletArr.length; i++) {
            if (i < index) {
                deletArr[i] = arr[i];
            } else {
                deletArr[i] = arr[i + 1];
            }
        }
        arr = deletArr;
        System.out.println("The Array After Deletion :");
        for (int i = 0 ; i <arr.length ; i++){
            System.out.print(arr[i] +"");
        }
    }
}
