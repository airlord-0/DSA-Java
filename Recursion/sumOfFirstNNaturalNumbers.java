package Recursion;
public class sumOfFirstNNaturalNumbers {
    public static void main (String[] args) {
        // objective is to calculate the sum of first n natural numbers 
        int sum = 0;
        int n = 5;
        int i = n;
        summer (i,sum,n);
    }
    public static void summer (int i, int sum, int n ) {
        if (i==1) {
            sum +=i; 
            System.out.println(sum);
            return;
        }
        sum +=i;
        summer(i-1,sum,n);

        

    }

}

