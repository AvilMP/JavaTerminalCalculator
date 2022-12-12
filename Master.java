import java.util.Scanner;

public class Master {

    Mathops mathops = new Mathops();

    private String appName = new String("Jtc alpha v0.8.9");
    private String stdMsg = new String("=. Wynik.\nc. Reset\ne. Wyjście\n>>>");

    private String text(int index){
        switch(index){
            case 1: return appName;
            case 2: return stdMsg;
            case 3: return "<<<\nWynik: ";
            case 4: return "Wprowadz wartość: ";
            case 5: return "Wybierz operacje: ";
            case 7: return mathops.addition.getName();
            case 8: return mathops.subtraction.getName();
            default: return " ";
        }
    }

    void ioMenager(){
        for(int i = 1; i <= 4; i++){
            switch(i){
                case 1: System.out.println(text(i));
                    break;  //print title.
                case 2:
                        for(int j = 7; j <= 7 + mathops.modules; j++){
                            System.out.println(text(j));
                        }
                        System.out.println(text(i));
                    break;  //print options.
                case 3: for(int f = 0; f < mathops.wideTable; f++){
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
        Scanner sc = new Scanner(System.in);

        if(sp == 0){
            System.out.println(text(4));
            mathops.setIntiger(sp, sc.nextInt());
        }
        else if(mathops.getChar(sp - 1) == 0){
            System.out.println(text(5));
            mathops.setOperand( (sp - 1), sc.next().charAt(0));
        }
        else{
            System.out.println(text(4));
            mathops.setIntiger(sp, sc.nextInt());
        }
    }

    void reset(){
        //...
    }

    boolean exit(){
        // ...
        return true;
    }
}
