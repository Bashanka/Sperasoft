package javafundamentals;

public class Practice1 {

    public int lowest2(int a, int b) {
        return a < b ? a : b;
    }

    public int lowest3(int a, int b, int c) {
        return lowest2(a, b) < c ? lowest2(a, b) : c;
    }

    public int lowest4(int a, int b, int c, int d) {
        return lowest3(a, b, c) < d ? lowest3(a, b, c) : c;
    }


}
