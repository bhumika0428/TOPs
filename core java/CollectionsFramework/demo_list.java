package CollectionsFramework;

import java.util.ArrayList;
import java.util.LinkedList;

public class demo_list {

	public static void main(String[] args) {
		
		ArrayList<String> arr=new ArrayList<String>();
		LinkedList<String> list=new LinkedList<String>();
		
		 arr.add("Apple");
	        arr.add("Banana");
	        arr.add("Cherry");

	        list.add("Dog");
	        list.add("Elephant");
	        list.add("Fox");
	        System.out.println("ArrayList elements:");
	        
	        for (String fruit : arr) {
	            System.out.println(fruit);
	        }

	        System.out.println("\nLinkedList elements:");
	        for (String animal : list) {
	            System.out.println(animal);
	        }

	        
	        arr.set(1, "Blueberry"); 

	        
	        list.remove("Fox");  

	        System.out.println("\nUpdated ArrayList:");
	        for (String fruit : arr) {
	            System.out.println(fruit);
	        }

	        System.out.println("\nUpdated LinkedList:");
	        for (String animal : list) {
	            System.out.println(animal);
	        }

	       
	        String arrayListElement = arr.get(1);  
	        String linkedListElement = list.get(1);  
	        System.out.println("\nElement at index 1 in ArrayList: " + arrayListElement);
	        System.out.println("Element at index 1 in LinkedList: " + linkedListElement);

	        boolean containsApple = arr.contains("Apple");
	        boolean containsFox = list.contains("Fox");

	        System.out.println("\nArrayList contains 'Apple': " + containsApple);
	        System.out.println("LinkedList contains 'Fox': " + containsFox);
		
	}
}
