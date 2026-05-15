package bit_manupilation;

public class set_bit {
    public static void main (String args[]){
        int n=5; //0101
        int pos=1;
        int bit_mask=1<<pos;
        int new_number= (bit_mask | n);
        System.out.println(new_number);


    }
    
}

