// Java program to compute exponential value under modulo
// using binary exponentiation.
import java.util.*;
import java.lang.*;
import java.io.*;

class exp_sq {
    static long N = 784319; // n = p * q
    public static void main(String[] args)
    {
        long base = 19070;
        long exp = 160009;

        long modulo = exponentiation(base, exp);
        System.out.println(modulo);
    }

    static long exponentiation(long base, long exp)
    {
        if (exp == 0)
            return 1;

        if (exp == 1)
            return base % N;

        long t = exponentiation(base, exp / 2);
        t = (t * t) % N;

        // if exponent is even value
        if (exp % 2 == 0)
            return t;

            // if exponent is odd value
        else
            return ((base % N) * t) % N;
    }
}
