package Recursion;

public class Fibonacci {
    public static void fiboMaker(int a, int b, int n ) {
        if (n==0){
            int c = a+b;
            System.out.println(c);
            return;
        }
        int c = a + b;
        System.out.println(c);
        fiboMaker(b,c,n-1);

        return;

    }

    public static void main (String[] args) {
        int a = 0;
        int b = 1; 
        int n = 9;
        System.out.println(a);
        System.out.println(b);
    
        fiboMaker(a,b,n-2);
    
    }
}
// 0,1,1,2,3,5,8,13,21