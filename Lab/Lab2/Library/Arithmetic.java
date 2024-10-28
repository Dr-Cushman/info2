
/**
 * Class Arithmetic.
 * 
 * @author Alexander Müller-Lobeck
 * @version 1.0 (Oct 2024)
 */
public interface Arithmetic
{
    /**
     * Returns (for n > 0) ceiling(log2(n)), i.e. the minimal l >= 0 such that n <= 2 ^ l.
     */
    public static int log(int n)
    {
        return (int) Math.ceil(Math.log(n) / Math.log(2));
    }

    public static boolean isPrime(int n) {
        if(n<=1){
            return false;
        }
        for(int i = 2; i <=n-1; i++){
            if(n%i == 0){
                return false;
            }
        }
      return true;
    }
}
