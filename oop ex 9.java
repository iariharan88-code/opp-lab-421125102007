import java.util.ArrayList;
public class StringArrayListOperations {
     static void append(ArrayList<String> list, String str) {
        list.add(str);
    }
    static void insert(ArrayList<String> list, int index, String str) {
        if (index >= 0 && index <= list.size()) {
            list.add(index, str);
        } else {
            System.out.println("Invalid index!");
        }
    }
    static void search(ArrayList<String> list, String str) {
        if (list.contains(str))
            System.out.println("String found: " + str);
        else
            System.out.println("String not found: " + str);
    }
   static void startsWith(ArrayList<String> list, char ch) {
        System.out.println("Strings starting with '" + ch + "':");

        for (String str : list) {
            if (!str.isEmpty() &&
                Character.toLowerCase(str.charAt(0)) ==
                Character.toLowerCase(ch)) {
                System.out.println(str);
            }
        }
    }
   static ArrayList<String> stringToArrayList(String str) {
        String[] words = str.split("\\s+");
        ArrayList<String> list = new ArrayList<>();

        for (String word : words) {
            list.add(word);
        }
       return list;
    }
    public static void main(String[] args) {
       ArrayList<String> list = new ArrayList<>();
        append(list, "Apple");
        append(list, "Banana");
        append(list, "Mango");
        append(list, "Orange");
        System.out.println("Initial ArrayList: " + list);
        insert(list, 2, "Grapes");
        System.out.println("After inserting at index 2: " + list);
        search(list, "Mango");
        search(list, "Pineapple");
        startsWith(list, 'A');

       String input = "Java is a programming language";
        ArrayList<String> convertedList =    stringToArrayList(input);
        System.out.println("\nOriginal String: " + input);
        System.out.println("Converted ArrayList: " + convertedList);
    }
}
