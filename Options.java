class Options {
    private static double a;
    private static double b;

    Options(){
        a = 0;
        b = 0;
    }

    void set(double aa, double bb) {
        a = aa; b = bb;
    }

    double getA(){
        return a;
    }

    double getB(){
        return b;
    }
}
