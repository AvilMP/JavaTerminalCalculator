
public class Master {
    
    Mathops mathops = new Mathops();

    private String appName = new String("Jtc v 0.2.0");
    private String stdMsg = new String("=. Wynik.\nc. Reset\ne. Wyjście\n>>>");

    public String text(int index){
        switch(index){
            case 1: return this.appName;                    //1 seq
            case 2: return this.stdMsg;                     //3 seq
            case 4: return "Wybierz operacje: ";            //5 seq<
            case 5: return "Wprowadz wartość: ";            //5 seq>
            case 3: return "<<<\nWynik: ";                  //4 seq++
            case 7: return mathops.addition.getName();      //2 seq
            case 8: return mathops.subtraction.getName();   //2 seq
            default: return " ";
        }
    }
}
