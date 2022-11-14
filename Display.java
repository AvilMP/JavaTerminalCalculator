
public class Display {
    
    Mathops mathops = new Mathops();

    public String text(int index){
        switch(index){
            case 1: return "JTC v 1.0";
            case 9: return "Wybierz operacje: ";
            case 8: return "Wprowadz wartość: ";
            case 7: return "Wynik: ";
            case 20: return " + ";
            case 21: return " - ";
            //case 110: return " * ";
            //case 111: return " / ";
            case 2: return "Q. +.";
            case 3: return "W. -.";
            case 4: return "X. =.";
            case 5: return "V. Wyjście.";
            case 255: return " ";
            case 6: return ": ";
            default: return "_";
        }
    }
}
