class Mathops {

    private byte wideTable = 30;  //max user numbers input.
    private double[] intigers = new double[wideTable];
    private char[]  operand = new char[wideTable];
    private double result;
    private byte modules;    //(mod<<)  add,sub...etc...

    //modules*
    Add addition            = new Add(); //mod++
    Sub subtraction         = new Sub(); //mod++
    Mul multiplication      = new Mul(); //mod++
    Div divison             = new Div(); //mod++
    Exp exponentiation      = new Exp(); //mod++
    //*modules

    Mathops(){
        reset();
        modules = (5) - 1; // (mod/mds).
    }

    void reset(){
        for(int i = 0; i < wideTable; i++){
            intigers[i] = 0;
            operand[i]  = 0;
        }
        result = 0;
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
                addition.set(result , intigers[i + 1]); 
            switch(operand[i]){
                case '+': result = addition.calculate()         ; break;
                case '-': result = subtraction.calculate()      ; break;
                case '*': result = multiplication.calculate()   ; break;
                case '/': result = divison.calculate()          ; break;
                case '^': result = exponentiation.calculate()   ; break;
                default : break;
            }
        }
    }
    //*cl
}
