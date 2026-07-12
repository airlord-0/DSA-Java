package bit_manupilation;

public class clear_bit {
    public static void main (String[] arg){
        int n = 5;
        int pos=2;
        int bitmask=1<<pos;
        int notBitMask=~(bitmask);
       int newNumber= (notBitMask & n);
       System.out.println(newNumber);

    }
}
