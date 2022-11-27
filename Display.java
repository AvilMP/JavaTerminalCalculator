
public class Display {
    
    Mathops mathops = new Mathops();

    private String appName = new String("Jtc v 0.2.0");
    private String stdMsg = new String("=. Wynik.\ne. Wyjście \n: ");

    public String text(int index){
        switch(index){
            case 1: return this.appName;
            case 2: return this.stdMsg;
            case 3: return "Wybierz operacje: ";
            case 4: return "Wprowadz wartość: ";
            case 5: return "Wynik: ";
            case 6: return mathops.addition.getName();
            case 7: return mathops.subtraction.getName();
            default: return " ";
        }
    }
}
