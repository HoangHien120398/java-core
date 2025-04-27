package java_abstraction;

abstract class Animal {
    //Abstract method (do not have a body)
    public abstract void animalSound();
    //Regular method
    public void sleep(){
        System.out.println("ZZZZ");
    }
}
