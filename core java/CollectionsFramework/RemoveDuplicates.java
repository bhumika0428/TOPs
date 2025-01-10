package CollectionsFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add("Apple");
        listWithDuplicates.add("Banana");
        listWithDuplicates.add("Apple");
        listWithDuplicates.add("Cherry");
        listWithDuplicates.add("Banana");
       
        System.out.println("Original List with Duplicates:");
        for (String item : listWithDuplicates) {
            System.out.println(item);
        }

        HashSet<String> setWithoutDuplicates = new HashSet<>(listWithDuplicates);

        System.out.println("\nSet without Duplicates:");
        for (String item : setWithoutDuplicates) {
            System.out.println(item);
        }

        List<String> listWithoutDuplicates = new ArrayList<>(setWithoutDuplicates);

        System.out.println("\nList without Duplicates:");
        for (String item : listWithoutDuplicates) {
            System.out.println(item);
        }
    }
}
