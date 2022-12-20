public class Mul extends Options {
    private String name = new String("*. Pomnóż | ");
    private char op;

    Mul() {
        op = '*';
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
        if(getB() == 0){ return getA();}
        else return getA() * getB();
    }
}
