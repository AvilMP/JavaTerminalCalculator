public class Mul extends Reg {
    private String name = new String("*. Pomnóż | ");
    private char op;

    Mul() {
        op = '*';
    }

    String getName(){
        return name;
    }

    char getop(){
        return op;
    }

    double calculate(){
        if(getB() == 0){ return getA();}
        else return getA() * getB();
    }
}
