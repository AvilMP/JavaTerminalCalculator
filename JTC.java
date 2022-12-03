// Java Terminal Calculator. 01.12.2022 - Scazza.

public class JTC {                                                          
    public static void main(String[] args) {
        Master master = new Master();

        do{
            master.outputMenager();
        }while(master.exit());
    }
}
