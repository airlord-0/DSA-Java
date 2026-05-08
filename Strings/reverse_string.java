import java.util.*;


public class reverse_string {

    public static void main (String[] args) {
        System.out.println("enter any name to get its reversed format : ");
        Scanner sc = new Scanner (System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        
        for(int i=0; i<=sb.length()/2;i++) {
        int front = (i);
        int back = (sb.length()-1-i);

        char frontwala=sb.charAt(front);
        char backwala=sb.charAt(back);
        

        sb.setCharAt(front, backwala);
        sb.setCharAt(back, frontwala);
       
    
    }
    sc.close();
     System.out.println(sb);
    
    }
}
    

