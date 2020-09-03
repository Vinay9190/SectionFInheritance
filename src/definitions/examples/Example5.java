package definitions.examples;

public class Example5 {
    public static void main(String[] args) {

    }
}

class A2 {
    private int j;
    private int k;

    public void setValues(int x, int y) {
        j = x;
        k = y;
    }

    public int m;

    void displayA() {
        System.out.println("j = " + j + ", k = " + k);
    }

    public int getJ() {
        return j;
    }

    public int getk() {
        return k;
    }
}

class B2 extends A2 {
    int p ;
}
