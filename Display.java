
public class Display {
    
    public String text(int index){
        switch(index){
            case 1: return "JTC v 1.0";
            case 2: return "Wybierz operacje: ";
            case 3: return "Wprowadz wartość: ";
            case 4: return "Wynik: ";
            case 5: return " + ";
            case 6: return " - ";
            //case 7: return " * ";
            //case 8: return " / ";
            case 9: return "Q. +.";
            case 10: return "W. -.";
            case 11: return "X. Wynik.";
            case 12: return "V. Wyjście.";
            case 13: return " ";
            case 14: return ": ";
            default: return "_";
        }
    }
}
