import java.util.Scanner;

public class JTC {                                                          
    public static void main(String[] args) {
        
        Display display = new Display();

        boolean programloop = true;
        Scanner sc = new Scanner(System.in);
        do{
            for(int i = 1; i <= 3; i++){
            
                System.out.println(display.text(i));
            
            //tabs print
            }
            programloop = false;
        }while(programloop);
    }
}
