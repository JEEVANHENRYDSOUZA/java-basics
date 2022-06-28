
class Main
{
    // Naive recursive solution to calculate `pow(x, n)`
    // using divide-and-conquer
    public static long power(int x, int n)
    {
        // base condition
        if (n == 0) {
            return 1L;
        }
 
        if ((n & 1) == 1) { // if `n` is odd
            return x * power(x, n / 2) * power(x, n / 2);
        }
 
        // otherwise, `n` is even
        return power(x, n / 2) * power(x, n / 2);
    }
 
    public static void main(String[] args)
    {
        int x = -2;
        int n = 10;
 
        System.out.println("pow(" + x + ", " + n + ") = " + power(x, n));
    }
}
