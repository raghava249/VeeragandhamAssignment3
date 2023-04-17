package vectorarray;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Example {
    public static void main(String[] args) {
        // Create a Vector and an ArrayList
        List<Integer> vectorList = new Vector<>();
        List<Integer> arrayList = new ArrayList<>();

        // Add elements to both lists
        for (int i = 0; i < 1000000; i++) {
            vectorList.add(i);
            arrayList.add(i);
        }

        // Measure the time it takes to get an element from the middle of the list
        long startTime = System.nanoTime();
        Integer vectorValue = vectorList.get(500000);
        long vectorTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        Integer arrayValue = arrayList.get(500000);
        long arrayTime = System.nanoTime() - startTime;

        // Print the results
        System.out.println("Vector: " + vectorTime + " ns");
        System.out.println("ArrayList: " + arrayTime + " ns");
    }
}

