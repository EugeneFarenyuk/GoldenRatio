// Task: Compute Golden Ratio using "continued fraction" representation of sqrt(5).
// Golden Ratio = (sqrt(5)+1)/2.
// Recursion is used.
public class GoldenRatio {
     public static int recursiveMethod(int i, double sqrtOf5) {        
        if(i == 0) {  
            sqrtOf5 = sqrtOf5 -2.0;
            double goldenRatio = (sqrtOf5+1.0)/2.0;
            System.out.printf("Golden Ratio = %.5f (limited to six s.f.)\n", goldenRatio);
        }
        else {
            sqrtOf5 = 4.0+1.0/sqrtOf5;
            recursiveMethod(--i, sqrtOf5);
        }
        return 0;
    }
    public static void main(String args[]) {         
       int a = recursiveMethod(10, 1.0);  // only 10 iterations is anough.
    }
}