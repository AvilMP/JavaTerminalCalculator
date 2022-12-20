// Java Terminal Calculator. beta v0.9.0 /// 01.12.2022 - Scazza.

public class JTC {                                                          
    public static void main(String[] args) {
        Master master = new Master();

        do{
            master.ioMenager();
        }while(master.exit());
    }
}
