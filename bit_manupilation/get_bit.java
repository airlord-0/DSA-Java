package bit_manupilation;

public class get_bit {
    public static void main(String[] args){
        int n=143; //in decimal 1010
        int pos=4;
        // here we are checking what binary number we have at 3rd position (we've 1 here)
        // to check we perform 2 steps 
        // step 1 : bit mask 1<<pos. in this case 0001<<3=1000
        // step 2 : operation & with bit mask and n such as (1000 & n)
        // after doing & operator if result is non zero then its one else its zero 
         // I typed all these comments because I didn't know what to do next :)

         int bitmask=1<<pos;

         if ((n & bitmask)==0){
            System.out.println("its zero at "+pos+" position");
         } else {
            System.out.println("its one at "+pos+" position");
         }

         


    } 
}
