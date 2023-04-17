package generic;

public class Driver {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("apple", 3);
        Pair<Double, Boolean> pair2 = new Pair<>(3.14, true);

        System.out.println("Pair 1: " + pair1.getFirst() + ", " + pair1.getSecond());
        System.out.println("Pair 2: " + pair2.getFirst() + ", " + pair2.getSecond());
    }
}

