class Mathops {

    private byte wideTable = 30;  //max user numbers input.
    private double[] intigers = new double[wideTable];
    private char[]  operand = new char[wideTable];
    private double result;
    private byte modules;    //(mod<<)  add,sub...etc...

    Mathops(){
        for(int i = 0; i < wideTable; i++){
            intigers[i] = 0;
            operand[i]  = 0;
        }
        result = 0;
        modules = (4) - 1; // (mod/mds).
    }

    int stackPointer(){ //dipslay number if != 0
        int i = -1;
        if(intigers[wideTable - 1] != 0){
            return 0;
        }
        do{
            i++;
        }while(intigers[i] != 0);
            return i;
    }

    void setIntiger(int tab , double num){
        intigers[tab] = num;
    }

    void setOperand(int tab , char ch){
        operand[tab] = ch;
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

    byte getModules(){
        return modules;
    }

    byte getTabWide(){
        return wideTable;
    }

    //cl*
    void calculate(){ //v2...
        result = intigers[0];
        for(int i = 0; i < (wideTable - 1); i++){
            switch(operand[i]){
                case '+': addition.set(result , intigers[i + 1])        ; result = addition.calculate()         ; break;
                case '-': subtraction.set(result, intigers[i + 1])      ; result = subtraction.calculate()      ; break;
                case '*': multiplication.set(result, intigers[i + 1])   ; result = multiplication.calculate()   ; break;
                case '/': divison.set(result, intigers[i + 1])          ; result = divison.calculate()          ; break;
                case '^': break;
                //...
                default : break;
            }
        }
    }
    //*cl

    //modules*
    Add addition            = new Add(); //mod++
    Sub subtraction         = new Sub(); //mod++
    Mul multiplication      = new Mul(); //mod++
    Div divison             = new Div(); //mod++
    //*modules
}
