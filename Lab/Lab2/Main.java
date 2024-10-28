
/**
 * Class Main.
 * 
 * @author Alexander Müller-Lobeck
 * @version 1.0 (Oct 2024)
 */
public class Main implements Tools, Randomness, Arithmetic
{
    /**
     * The static main method. It creates an instance of 'Main' and then calls the non-static method 'run'.
     * This way, in 'run' you can use the helper methods from the base classes/interfaces without having to prefix the calls with "instance.".
     */
    public static void main(String[] args)
    {
        Main instance = new Main();
        instance.run(args);
    }

    /**
     * The non-static method that 'main' will execute.
     */
    public void run(String[] args)
    {
        // Test the log method
        int logResult = Arithmetic.log(16);
        System.out.println("log(16) = " + logResult); // Expected: 4

        // Test the isPrime method
        boolean isPrimeResult = Arithmetic.isPrime(17);
        System.out.println("isPrime(17) = " + isPrimeResult); // Expected: true

        isPrimeResult = Arithmetic.isPrime(18);
        System.out.println("isPrime(18) = " + isPrimeResult); // Expected: false>
    }
}
