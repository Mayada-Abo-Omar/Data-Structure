public class Main {
    public static void main(String[] args) {
        String[] Students = new String[5];
        Students[0] = "Mayada";
        Students[1] = "Asmaa";
        Students[2] = "Rewaa";
        Students[3] = "mai";
        Students[4] = "Mariam";

        System.out.println("Name 1: " + Students[0]);
        System.out.println("Name 2: " + Students[1]);
        System.out.println("Name 3: " + Students[2]);
        System.out.println("Name 4: " + Students[3]);
        System.out.println("Name 5: " + Students[4]);
        System.out.println("                                              ");
        System.out.println("The Length is : " + Students.length);

        for (int i = 0; i < Students.length; i++) {
            System.out.println(Students[i]);
        }
    }
}