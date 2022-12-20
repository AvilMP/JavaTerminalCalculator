public class Add extends Options{

    private String name = new String("+. Dodaj | ");
    private char op;

    Add() {
        op = '+';
        setA(0);
        setB(0);
    }

    String getName(){
        return name;
    }

    char getop(){
        return op;
    }

    void set(double a, double b) {
        setA(a); setB(b);
    }

    double calculate(){
        return getA() + getB();
    }
}
