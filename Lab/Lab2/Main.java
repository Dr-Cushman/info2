
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
        // YOUR CODE GOES HERE!
    }
}
