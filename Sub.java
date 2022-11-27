
public class Sub {

    private String name = new String("-. Odejmij.");
    private char op;
    private float a;
    private float b;

    public Sub() {
        this.op = '-';
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

    public float calculate(){
        return this.a - this.b;
    }
}
