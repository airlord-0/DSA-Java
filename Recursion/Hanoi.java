package Recursion;

public class Hanoi {

    public static void main (String[] idli) {
        solver (4,'A','B','C');

    }

    static void solver(int n, char source,char auxiliary,char destination ) {
        // base case when n = 1  
        if (n == 1 ) {
            System.out.println("move disk " + n + " from " + source + " to " + destination);
            return;
        }
        // move n-1 disks to auxiliary , the primary goal is to move disks from A -> B, thus B is my new destination while I use destination as auxiliary 
        solver (n-1,source, destination,auxiliary);

        // move the biggest disk to the destination, since its only one step move I need not recursify it
        System.out.println("move disk " + n + " from " + source + " to " + destination);

        // move n -1 disks which are in auxiliary now, to destination. auxiliary is the source, source is auxiliary while destination is same 
        solver(n-1,auxiliary,source,destination);


    }
    
}
