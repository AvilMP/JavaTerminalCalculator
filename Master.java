import java.util.Scanner;

public class Master {
    
    Mathops mathops = new Mathops();
    Scanner sc = new Scanner(System.in);

    private String appName = new String("Jtc v 0.3.5");
    private String stdMsg = new String("=. Wynik.\nc. Reset\ne. Wyjście\n>>>");

    public String text(int index){
        switch(index){
            case 1: return this.appName;
            case 2: return this.stdMsg;
            case 3: return "<<<\nWynik: ";
            case 4: return "Wprowadz wartość: ";
            case 5: return "Wybierz operacje: ";
            case 7: return mathops.addition.getName();
            case 8: return mathops.subtraction.getName();
            default: return " ";
        }
    }

    void outputMenager(){
        for(int i = 1; i <= 4; i++){
            if(i == 2){    //print options
                for(int j = 7; j <= 7 + (mathops.modules); j++){
                    System.out.println(text(j));
                }
            }
            else if(i == 3){     //print numbs & ops
                for(int f = 0; f < mathops.wideTable; f++){
                    if(mathops.getNumb(f) == 0){
                        break;
                    }
                    else{
                        System.out.print(mathops.getNumb(f)); System.out.print(' ');
                    }
                    System.out.print(mathops.getChar(f)); System.out.print(' '); 
                }
                System.out.println();
            }
            else if(i == 4){
                //...
            }
            System.out.println(text(i));
        }
    }

    boolean exit(){
        // ...
        return false;
    }
}
