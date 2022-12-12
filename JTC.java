// Java Terminal Calculator. alpha v0.8.9 /// 01.12.2022 - Scazza.

public class JTC {                                                          
    public static void main(String[] args) {
        Master master = new Master();

        do{
            master.ioMenager();
        }while(master.exit());
    }
}
