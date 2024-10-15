package itm.oss;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Calculator calculator = new Calculator();
        System.out.println("5 + 5 = " + calculator.add(5, 5));
    }
}