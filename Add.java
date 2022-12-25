public class Add extends Reg {

    private String name = new String("+. Dodaj | ");
    private char op;

    Add() {
        op = '+';
    }

    String getName(){
        return name;
    }

    char getop(){
        return op;
    }

    double calculate(){
        return getA() + getB();
    }
}
