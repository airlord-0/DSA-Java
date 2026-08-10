package bit_manupilation;
public class clear_bit {
    public static void main (String[] args) {
        int n =5;
        int pos=2;
      int bit_mask=1<<pos;
      int not_bit_mask=~bit_mask;
      int newbit = (not_bit_mask & n);
      System.out.println(newbit);

    }
}