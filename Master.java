import java.util.Scanner;

public class Master {

    Mathops mathops = new Mathops();
    Scanner sc = new Scanner(System.in);

    private static boolean programOn = true;
    private String appName = new String("Jtc beta v0.9.8\nMenu:  ");
    private String stdMsg = new String(" c. Reset | e. Wyjście\n>>>");

    private String text(int index){
        switch(index){
            case 1:  return appName;
            case 2:  return stdMsg;
            case 3:  return ">>>\nWynik: ";
            case 4:  return "Wprowadz wartość: ";
            case 5:  return "Wybierz operacje: ";
            case 7:  return mathops.addition.getName();
            case 8:  return mathops.subtraction.getName();
            case 9:  return mathops.multiplication.getName();
            case 10: return mathops.divison.getName();
            case 11: return mathops.exponentiation.getName();
            default: return " ";
        }
    }

    void ioMenager(){
        for(int i = 1; i <= 4; i++){
            switch(i){  
                case 1: //print title.
                        System.out.println(text(i));
                    break;
                case 2:
                        for(int j = 7; j <= 7 + mathops.getModules(); j++){
                            System.out.print(text(j));
                        }
                            System.out.println(text(i));
                    break;  //print options.
                case 3: for(int f = 0; f < mathops.getTabWide(); f++){
                            if(mathops.getNumb(f) == 0){
                                break;
                            }
                            else{
                                System.out.print(mathops.getNumb(f)); System.out.print(' ');
                            }
                                System.out.print(mathops.getChar(f)); System.out.print(' '); 
                        }
                            System.out.println();
                            System.out.println(text(i) + mathops.getResult());
                    break;  //print numb + op.
                case 4: inputMenager(mathops.stackPointer());
                        mathops.calculate();
                    break;  //print input op.
                    
            }
        }
    }

    void inputMenager(int sp){ //select from stackPointer();

        if(sp == 0){
            System.out.println(text(4));
            mathops.setIntiger(sp, sc.nextInt());
        }
        else if(mathops.getChar(sp - 1) == 0){
            System.out.println(text(5));
            mathops.setOperand( (sp - 1), sc.next().charAt(0));
            if(mathops.getChar(sp - 1) == 'c') mathops.reset();
            else if(mathops.getChar(sp - 1 ) == 'e') programOn = false;
        }
        else{
            System.out.println(text(4));
            mathops.setIntiger(sp, sc.nextInt());
        }
    }

    void cl(){ //v1
        for(int i = 0; i < 4; i++){
            System.out.println();
        }
        try{
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")){
                Runtime.getRuntime().exec("cls");
            }
            else{
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e){}
    }

    void reset(){
        mathops.reset();
    }

    boolean exit(){
        return programOn;
    }
}
