public class Sub extends Options {
    private String name = new String("-. Odejmij | ");
    private char op;

    Sub() {
        op = '-';
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
        return getA() - getB();
    }
}
