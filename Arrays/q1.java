 import java.util.*;

public class q1 {
   public static void main (String args[]) {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int marks[] = new int[n];
    for (int i=0; i<n; i++) {
        marks[i]=sc.nextInt();       
    }
    System.out.println("enter the number u wanna search index of : ");
    int search = sc.nextInt();
    
    for (int j=0; j<n; j++) {
        if (marks[j]==search) {
            System.out.print("the number is idexed at : "+j);
            
        }
        
        
    }

   } 
}
