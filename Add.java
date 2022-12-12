
public class Add{

    private String name = new String("+. Dodaj.");
    private char op;
    private double a;
    private double b;

    Add() {
        op = '+';
        a = 0;
        b = 0;
    }

    String getName(){
        return name;
    }

    char getop(){
        return op;
    }

    void set(double a, double b) {
        this.a = a; this.b = b;
    }

    double calculate(){
        return a + b;
    }
}
