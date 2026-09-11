package bit_manupilation;
import java.util.Scanner;

public class second_compliment {
    public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the number :  ");
    int a = sc.nextInt();
    int bits = 8;
    int second_compliment = ~a+1;
    int bit_mask = (1<<bits) -1;
    System.out.println(Integer.toBinaryString(second_compliment & bit_mask));
    sc.close();
    }
}
