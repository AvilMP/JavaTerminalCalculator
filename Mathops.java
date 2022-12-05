
public class Mathops {
    public static byte wideTable = 30;  //max user numbers input.
    private double[] intigers = new double[wideTable];
    private char[]  operand = new char[wideTable];
    private double result;
    public byte modules;    //(mod<<)  add,sub...etc...

    public Mathops(){
        for(int i = 0; i < wideTable; i++){
            this.intigers[i] = 0;
            //t*
            //this.intigers[0] =1.3;
            //this.intigers[1] =2.3;
            //*t
            this.operand[i]  = 0;
        }
        this.result = 0;
        this.modules = (2) - 1; // (mod/mds).
    }

    public int stackPointer(){
        int i = -1;
        if(this.intigers[29] != 0){
            return 0;
        }
        do{
            i++;
        }while(this.intigers[i] != 0);
            return i;
    } 

    double getNumb(int tabNumb){
        return intigers[tabNumb];
    }

    char getChar(int tabChar){
        return operand[tabChar];
    }

    double getResult(){
        return this.result;
    }

    //
    Add addition = new Add(); // mod++

    public void add(){
        //...
    }

    Sub subtraction = new Sub(); //mod++
}
