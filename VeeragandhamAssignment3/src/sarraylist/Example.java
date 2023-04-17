package sarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Example {
    public static void main(String[] args) {
        // Create a regular ArrayList
        List<String> arrayList = new ArrayList<>();

        // Create a synchronized list using Collections.synchronizedList()
        List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>());

        // Create a Vector, which is synchronized by default
        List<String> vector = new Vector<>();

        // Add elements to all the lists
        for (int i = 0; i < 10; i++) {
            arrayList.add("Element " + i);
            synchronizedList.add("Element " + i);
            vector.add("Element " + i);
        }

        // Print the contents of the lists
        System.out.println("ArrayList: " + arrayList);
        System.out.println("Synchronized List: " + synchronizedList);
        System.out.println("Vector: " + vector);
    }
}
