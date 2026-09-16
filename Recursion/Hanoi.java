package Recursion;

public class Hanoi {

    public static void main (String[] idli) {
     
        solver (4,'A','B','C');

    }

  
    public static void solver (int n, char source, char auxiliary, char destination) {
        // base case 

        if (n==1 ) {
            System.out.println(source + " -> " + destination);
            return ; 
        }

        // move n-1 disks to the auxiliary 
        solver (n-1, source, destination,auxiliary);

        // move the largest disk to the destination
        System.out.println(source + " -> " + destination);

        // move n-1 disks to the destination 
        solver (n-1,auxiliary, destination ,source);

    }




























   
}
