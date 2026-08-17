package Recursion;


// lets make a function that keeps calling itself untill a condition is met 

public class simple {
    public static void main (String[] args) {
        int n =5, m=1;
        printer(n );
        System.out.println(" ");
        printer2(m);
    

    }
    
    public static void printer (int n ) {
        
        if (n==0) {
            return;
        }

        
        System.out.print(n+ " ");
        printer(n-1);
        
    }
    
    public static void printer2(int m) {

        if (m==6) {
            return;
        }

        System.out.print(m + " ");
        printer2(m+1);

    }
    
}
  