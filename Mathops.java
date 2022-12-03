
public class Mathops {
    public static byte wideTable = 30;  //max user numbers input.
    private float[] intigers = new float[wideTable];
    private char[]  operand = new char[wideTable];
    private double result;
    public byte modules;

    public Mathops(){
        for(int i = 0; i < wideTable; i++){
            this.intigers[i] = 0;
            this.operand[i]  = 0;
        }
        this.result = 0;
        this.modules = (2) - 1; // (mod/mds).
    }

    float getNumb(int tabNumb){
        return intigers[tabNumb];
    }

    char getChar(int tabChar){
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
