vimport java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ali", 21));
        students.add(new Student("Sara", 20));
        students.add(new Student("Mona", 19));
        System.out.println("Size: " + students.size());
        System.out.println("Name: " + students.get(1).name);
        System.out.println("Age: " + students.get(0).age);
        for (int i = 0; i < students.size(); i++) {
            students.get(i).display();
        }
        students.add(new Student("Ahmed", 22));
        System.out.println("New Size: " + students.size());
        int[] numbers = {10, 20, 30};
        System.out.println("Array Length: " + numbers.length);
    }
}