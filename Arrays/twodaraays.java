import java.util.Scanner;

public class twodaraays {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int rows = sc.nextInt();
        int cols= sc.nextInt();

        // declare a 2d array now 
        int [][] matrix = new int [rows] [cols];

        // to take inpute use 2 loops with out loop controling rows
        // and inner loop controlling cols such as for each row we take 
        // n cols input 

        for (int i=0; i<rows;i++) {
            for (int j=0; j<cols; j++) {
               // ask the user for the input 
               System.out.println("enter the number of  : " + i + j);
               
               matrix[i][j]=sc.nextInt();
               
            }
        }
        System.out.println("enter the number u wanna search : ");
        
        int search =sc.nextInt();
        for (int i=0; i<rows;i++) {
            for (int j=0; j<cols; j++) {
                System.out.println(matrix[i][j]+" ");
                if (search==matrix[i][j]) {
                    System.out.println("the searched value is indexed at : "+i+j);
                    
                }
                

            }
            System.out.println("");
            
        }   
        sc.close();

    }
}