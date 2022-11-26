
public class Mathops {
    //user cout
    private static byte wideTable = 30;
    private float[] intigers = new float[wideTable];
    private byte[]  operand = new byte[wideTable];
    private double result;

    public Mathops(){
        for(int i = 0; i < wideTable; i++){
            this.intigers[i] = 0;
        }
        for(int i = 0; i < wideTable; i++){
            this.operand[i] = 0;
        }
        this.result = 0;
    }

    //typical op
    Add addition = new Add();

    public void add(){
        //
    }

    Sub subtraction = new Sub();
    //specjal op
}
