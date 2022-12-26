import java.lang.Math;
public class Exp extends Reg {

    private String name = new String("^. Potęguj | ");
    private char op;

    Exp() {
        op = '^';
    }

    String getName(){
        return name;
    }

    char getop(){
        return op;
    }

    double calculate(){
        if(getB() == 0){ return getA();}
        else{
            //...
            return Math.pow(getA(), getB());
        }
    }
}
