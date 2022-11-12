
public class Display {
    
    public String text(int index){
        switch(index){
            case 1: return "Javacus v 1.0";
            case 2: return "Wybierz operacje: ";
            case 3: return "Wprowadz wartość: ";
            case 4: return "Wynik: ";
            default: return "null";
        }
    }
}
