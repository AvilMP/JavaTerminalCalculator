
public class Mathops {
    //user cout
    public static byte wideTable = 30;
    private float[] intigers = new float[wideTable];
    private char[]  operand = new char[wideTable];
    private double result;
    public int modules;

    public Mathops(){
        for(int i = 0; i < wideTable; i++){
            this.intigers[i] = 0;
            this.operand[i]  = '+';
        }
        this.result = 0;
        this.modules = 2;
    }

    float getNumb(int tabNumb){
        return intigers[tabNumb];
    }

    char getChar(int tabChar){
        if(tabChar == wideTable - 1) {
            return ' ';
        }
        return operand[tabChar];
    }

    //typical op
    Add addition = new Add();

    public void add(){
        //
    }

    Sub subtraction = new Sub();
    //specjal op
}
