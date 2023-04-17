package finalfinallyfinalize;

public class Example {
    public static void main(String[] args) {
        try {
            FinalExample finalExample = new FinalExample();
            finalExample.printValue();
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            System.out.println("This 'finally' block always gets executed.");
        }

        // Trigger garbage collection to call the finalize method.
        System.gc();
    }
}

class FinalExample {
    private final int VALUE = 10;

    void printValue() {
        System.out.println("Value: " + VALUE);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("The 'finalize' method has been called.");
    }
}

