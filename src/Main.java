public class Main {
    public static void main(String[] args) {
        System.out.print("Hello World! ");
        System.out.print("I will print on the same line.");
        System.out.println(3 + 3);
        System.out.println(2*5);
        System.out.println(6/3);
        System.out.println(8%5);

        String greeting = "Hello";
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the text is: " + txt.length());

        //String methods
        String txt_1 = "Hello Word";
        System.out.println(txt_1.toUpperCase());
        System.out.println(txt_1.toLowerCase());

        String txt_2 = "Please locate where 'locate' occurs!";
        System.out.println("Position of the 'locate' is: " + txt_2.indexOf("locate"));
    }
}