package bank;

import OOPS.polymorphosysm;

class accounts {
    protected String name;
    private String password;
    public void display () {
        System.out.println("bank balance is " + "billionaire");
    }

    // get the password through a method 
    // setters and getters 

    public String get_password () {
        return this.password;
    }
    public void set_password (String new_password){
        this.password = new_password;
          
    }

}

public class Users {
    public static void main (String [] args) {
        accounts user1 = new accounts();
        user1.set_password("$Airlord@1028#");
        System.out.println(user1.get_password());
    }
}
