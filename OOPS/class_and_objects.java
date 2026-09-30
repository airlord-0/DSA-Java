package OOPS;

public class class_and_objects { // only one public class in java
    public static void main (String[] args) {
        Pen p1 = new Pen();
        p1.type = "get";
        p1.color = "red";
        p1.display();
        p1.pen_details();

        Pen p2 = new Pen (p1);
        p2.display();
        p2.pen_details();
    }
}

class Pen { // user defined class 
    String type; 
    String color; 

    public void display () { // method defined by user
        System.out.println("writing something");
    }
    public void pen_details (){
        System.out.println("the color of pen is : " + this.color + " and " + " the type of the pen is : " + this.type);
    }

    Pen (Pen p2) {
        this.type = p2.type;
        this.color = p2.color; 
    }
    Pen () {

    }

}
