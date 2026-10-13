package Problems;

public class prime {
    public static void main (String[] args) {
        int age = 100;

        switch (age) {
            case 10 :
                System.out.println("kids");
                break;
            case 15 : 
                System.out.println("teen");
                break;
            case 20 :
                System.out.println("adult");
                break;
            default :
                System.out.println("enter valid age");     
        }
        try {
        if (age == 20 ) {
            System.out.println("adult");
        }else if (age == 25) {
            System.out.println("grown up ");
        } else if (age == 30) {
            System.out.println("gentle man");
        }

        }
        catch (Exception e ) {
            System.out.println("Try again mah ");
        }

        int roshan = 35;

        for (int i =0; i<=60; i++)
        {
            if (i == 35) {
                continue;
            }
            else {
                System.out.println("here's your laddu for roll number : " + i);
            }
        } 

        }

        
    }
}
