package methods;

import java.util.jar.Manifest;

public class Main {
    //Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    //public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating object");
    }
    //Main method
    public static void main(String[] args) {
        myStaticMethod();
        Main myObj = new Main();
        myObj.myPublicMethod();
    }

}
