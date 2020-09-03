package definitions.examples;

public class Example5 {
    public static void main(String[] args) {
    A2 objectA2 = new A2();
    B2 objectB2 = new B2();
    objectA2.setValues(5,6);
    objectA2.m = 10;
    objectA2.displayA();
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
        System.out.println("j = " + j + ", k = " + k + " m = " + m);
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

    void displayB2() {
        System.out.println("p = " + p);
        System.out.println("m = " + m);
    }
}
