package OOPS;

public class polymorphosysm {
    public static void main (String[] args) {
    Car c1 = new Car();
    c1.model = "Swift_neo";
    c1.horse_power = 450;
    c1.getInfo(c1.model);       // the java decides which function to call I don't have to worry 
    c1.getInfo(c1.horse_power);
    c1.getInfo("swift_desi", 600);
    }

}

class Car {
    String model; 
    int horse_power; 

    // defining multiple funtions with the same name to let the java decide which function to
    // call for which arguments 

    public void getInfo(String model) {
        System.out.println(this.model);
    }
    public void getInfo(int horse_power) {
        System.out.println(this.horse_power);

    }
    public void getInfo(String model, int horse_power) {
        System.out.println(this.model + " " + this.horse_power);
    }

}
