public class ExtendedEuclid {

    //  return array [d, a, b] such that d = gcd(p, q), ap + bq = d
    static int[] gcd(int p, int q) {
        if (q == 0)
            return new int[] { p, 1, 0 };

        int[] vals = gcd(q, p % q);
        int d = vals[0];
        int a = vals[2];
        int b = vals[1] - (p / q) * vals[2];
        return new int[] { d, a, b };
    }

    public static void main(String[] args) {
        int p = 35;//오일러수
        int q = 7;//e
        if (p <= 0 || q <= 0) throw new IllegalArgumentException("p and q must be positive integers");
        int vals[] = gcd(p, q);
        System.out.println("d = " + vals[2]);
    }
}