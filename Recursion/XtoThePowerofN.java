// I'll have 2 base cases : 
// 1 : if x = = 0; return 0;
// 2 : if x ^ 0 = 1; 
// the logic would be : x * x^(n-1) = x^(1+n-1) = x^n
package Recursion;

// question : Print x^n (stack_he)
public class XtoThePowerofN {
    
    public static void main (String[] args) {
        int x = 5;
        int n = 3;
        int result = powerhouse(x, n);
        System.out.println(result);

    }

    public static int powerhouse (int x, int n) {
        if (x==0){
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int xn = powerhouse(x, n-1);

        return x*xn;
    }

}