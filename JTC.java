public class JTC {                                                          
    public static void main(String[] args) {

        Display display = new Display();
        Mathops mathops = new Mathops();
        boolean programloop = true;
        
        do{
            for(int i = 1; i < 20; i++){                                         
                if(i == 3){
                    break;
                }
                System.out.println(display.text(i));
            }
            programloop = false;
        }while(programloop);
    }
}
