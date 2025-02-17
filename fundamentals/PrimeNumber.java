package fundamentals;

public class PrimeNumber {
    private static boolean isPrime(int n) {
        if (n == 1)
            return false;
        else if (n> 3 && (n % 2 == 0 || n % 3 == 0))
          return false;
        for (int i = 5; i*i<=n; i+=6) {
            if ( n % i == 0 || n % (i+2)==0)
                return false;
        }
        
        return true;
    }
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        System.out.println(isPrime(n)?"Prime":"Not Prime");        
    }
}
