
public class Mathops {

    public static byte wideTable = 30;  //max user numbers input.
    private double[] intigers = new double[wideTable];
    private char[]  operand = new char[wideTable];
    private double result;
    public byte modules;    //(mod<<)  add,sub...etc...

    Mathops(){
        for(int i = 0; i < wideTable; i++){
            intigers[i] = 0;
            operand[i]  = 0;
        }
        result = 0;
        modules = (2) - 1; // (mod/mds).
    }

    int stackPointer(){
        int i = -1;
        if(intigers[wideTable -1] != 0){
            return 0;
        }
        do{
            i++;
        }while(this.intigers[i] != 0);
            return i;
    }

    void setIntiger(int tab , double num){
        this.intigers[tab] = num;
    }

    void setOperand(int tab , char ch){
        this.operand[tab] = ch;
    }

    double getNumb(int tabNumb){
        return intigers[tabNumb];
    }

    char getChar(int tabChar){
        return operand[tabChar];
    }

    double getResult(){
        return result;
    }

    //cl*
    void calculate(){ //v2...
        result = intigers[0];
        for(int i = 0; i < (wideTable - 1); i++){
            switch(operand[i]){
                case '+': addition.set(result , intigers[i + 1]); result = addition.calculate(); break;
                case '-': subtraction.set(result, intigers[i + 1]); result = subtraction.calculate(); break; //...
                default : break;
            }
        }
    }
    //*cl

    //modules*
    Add addition = new Add(); // mod++
    Sub subtraction = new Sub(); //mod++
    //*modules
}
