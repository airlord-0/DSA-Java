package bit_manupilation;

import java.util.*;
public class update_bit {

    // when changing number from 1 to 0, ~(binmask) & (number)
    // public static void main (String[] arg) {
    //    int number=5; // 0101 in binary
    //    int position=2; 
    //    int bit_mask= 1<<position;
    //    int neg_bit_mask=~bit_mask;
    //    int new_number= (neg_bit_mask) & (number);
    //    System.out.println(new_number);

    //    // when changing number from 0 to 1, (binmask) or (number)

    //    int pnumber=5; // 0101 in binary
    //    int pposition=1; 
    //    int pbit_mask= 1<<pposition;
    //    int pneg_bit_mask=~pbit_mask;
    //    int pnew_number= (pneg_bit_mask) & (pnumber);
    //    System.out.println(pnew_number);

    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the desired operation to be performed 1 -> 1 to 0, 0-> 0 to 1");
    int operation = sc.nextInt();
    int number = 5; // 0101 in binary 
    int position = 2;
    int bit_mask= 1<<position;

    if (operation==0) {
        int new_number = (bit_mask) | (number);
        System.out.println(new_number);
    } else {
        int new_number=(~(bit_mask)) & (number);
        System.out.println(new_number);
    }
    System.out.println("I coded this debuged it solved it all by myself only because I'm able to think clearly I take it as a win :) I'm gonna be even smarter ");

    }
}
