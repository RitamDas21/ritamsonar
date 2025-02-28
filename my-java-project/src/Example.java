public class Example {

    public static void main(String[] args) {
        // This method has a few issues for SonarQube to analyze
        int result = addNumbers(5, 10);
        System.out.println("The result is: " + result);
        
        // Unused variable
        int unusedVariable = 42;

        // Potential null pointer exception
        String str = null;
        System.out.println("String length: " + str.length());

        // Infinite loop
        for (int i = 0; i < 10; i--) {
            System.out.println("This will run forever!");
        }
    }

    public static int addNumbers(int a, int b) {
        return a + b; // This method is fine
    }
}
