package square.root;

public class SquareRoot {
    
    public static final double PRECISION = 0.00001;
    
    public static double sqrt(double n) {
        double lo = 0.0, hi = n, mid = 0;
        
        while (hi - lo > PRECISION) {
            mid = (lo + hi) / 2.0;
            if (mid * mid > n) {
                hi = mid;
            } else {
                lo = mid;
            }
        }
        
        return mid;
    }
    
    public static void main(String[] args) {
        System.out.println(sqrt(2));
    }
    
}
