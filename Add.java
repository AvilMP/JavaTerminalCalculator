
public class Add {

    private String name = new String("+. Dodaj.");
    private char op;
    private float a;
    private float b;

    public Add() {
        this.op = '+';
        this.a = 0;
        this.b = 0;
    }

    public String getName(){
        return this.name;
    }

    public char getop(){
        return this.op;
    }

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    float calculate(){
        return this.a + this.b;
    }
}
