package Recursion;
public class sumOfFirstNNaturalNumbers {

    public static void main ( String[] args) {
        int i = 1;
        int n = 5; 
        int sum = 0;
        summer (i,n,sum);

    }

    public static void summer (int i, int n, int sum ) {
        if (i==n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        System.out.print(sum + " ");
        summer (i+1, n,sum);

        

    }
}