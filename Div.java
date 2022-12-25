public class Div extends Options{
    private String name = new String("/. Podziel | ");
    private char op;

    Div() {
        op = '/';
    }

    String getName(){
        return name;
    }

    char getop(){
        return op;
    }

    double calculate(){
        if(getB() == 0){ return getA();}
        else return getA() / getB();
    }

    
}