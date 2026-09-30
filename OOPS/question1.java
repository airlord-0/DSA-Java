package OOPS;

import java.util.Arrays;

public class question1 {
    public static void main (String[] args) {
        Student student1 = new Student();
        student1.Name = "pavan";
        student1.Grade = 12;
        student1.Age = 21;
        student1.marks = new int[] {50,50,50,50,50};
        student1.display();
        System.out.println(student1.average());
        student1.pass();
    }

\
|}

class Student {
    String Name; 
    int Grade; 
    int Age;
    int [] marks; 

    public void display () {
        System.out.println(this.Name);
         System.out.println(this.Grade);
          System.out.println(this.Age);
           System.out.println(Arrays.toString(this.marks));
    }
    public int average (){
        int sum = 0;
        for (int i : this.marks) {
            sum +=i;
        }
        
        
        return sum/this.marks.length;
    }
    public boolean pass () {
        if (this.average()>49) {
            System.out.println("congrats you have passed");
            return true;
        }
        else {
            System.out.println("sorry you have failed");
            return false;
        }
    }

}
