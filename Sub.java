public class Sub extends Reg {
    private String name = new String("-. Odejmij | ");
    private char op;

    Sub() {
        op = '-';
    }

    String getName(){
        return name;
    }

    char getop(){
        return op;
    }

    double calculate(){
        return getA() - getB();
    }
}
