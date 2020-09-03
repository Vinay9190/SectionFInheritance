package definitions.examples;

public class Example5 {
    public static void main(String[] args) {
    A2 objectA2 = new A2();
    B2 objectB2 = new B2();
    objectA2.setValues(5,6);
    objectA2.m = 10;
    objectA2.displayA();
    objectB2.m = 6;
    objectB2.p = 8;
    objectB2.displayB();
    objectB2.setValues(12,18);
    System.out.println("j = " + objectB2.getJ());
    System.out.println("k = " + objectB2.getk());
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
        System.out.println("j = " + j + ", k = " + k + ", m = " + m);
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

    void displayB() {
        System.out.println("p = " + p);
        System.out.println("m = " + m);
    }
}
