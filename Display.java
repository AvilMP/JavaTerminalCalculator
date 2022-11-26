
public class Display {
    
    Mathops mathops = new Mathops();

    private String appName = new String("Jtc v 0.2.0");

    public String text(int index){
        switch(index){
            case 1: return this.appName;
            case 9: return "Wybierz operacje: ";
            case 8: return "Wprowadz wartość: ";
            case 7: return "Wynik: ";
            case 20: return " + ";
            case 21: return " - ";
            case 2: return mathops.addition.getName();
            case 3: return mathops.subtraction.getName();
            case 4: return "=. Wynik.";
            case 5: return "E. Wyjście.";
            case 6: return ": ";
            default: return " ";
        }
    }
}
