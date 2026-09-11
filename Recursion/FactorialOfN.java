package Recursion;
import java.util.*;
// objective is to calculate the factorial of n using recursion
// factorial of 1 and 0 is one 
public class FactorialOfN {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        sc.close();
        int result = FactoMaker(n);
        System.out.println(result);
    }

    public static int FactoMaker (int n ) {
        if (n==1| n==0) {
            return 1;
        }
        
        int facto = n * FactoMaker(n-1);
        return facto;

    }
}