import java.util.Scanner;

public class JTC {                                                          
    public static void main(String[] args) {
        Master master = new Master();
        boolean programloop = true;
        Scanner sc = new Scanner(System.in);

        do{
            for(int i = 1; i <= 5; i++){
                if(i == 2){    //print options
                    for(int j = 7; j <= 7 + (master.mathops.modules - 1); j++){
                        System.out.println(master.text(j));
                    }
                }
                if(i == 3){     //print numbs & ops
                    for(int f = 0; f < master.mathops.wideTable; f++){
                        if(master.mathops.getNumb(f) == 0){
                            break;
                        }
                        else{
                            System.out.print(master.mathops.getNumb(f)); System.out.print(' ');
                        }
                        System.out.print(master.mathops.getChar(f)); System.out.print(' '); 
                    }
                    System.out.println();
                }
                System.out.println(master.text(i));
            }
            programloop = false;
        }while(programloop);
    }
}
