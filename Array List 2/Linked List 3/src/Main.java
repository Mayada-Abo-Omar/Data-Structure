import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
ArrayList<String> shoppingList =new ArrayList<>();
shoppingList.add("Milk");
shoppingList.add("Bread");
shoppingList.add("Eggs");
for (int i = 0 ; i<shoppingList.size() ; i++){
    System.out.println(shoppingList.get(i));
}
System.out.println(shoppingList.size());
shoppingList.add(1,"Cheese");
for (int i = 0 ; i<shoppingList.size() ; i++){
System.out.println(shoppingList.get(i));
        }
shoppingList.set(2 , "Rice");
System.out.println(shoppingList.contains("Milk"));
for (int i = 0 ; i<shoppingList.size() ; i++){
    System.out.println(shoppingList.get(i));
}
        System.out.println(shoppingList.size());
    }
}