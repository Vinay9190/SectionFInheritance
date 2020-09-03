package definitions.examples;

public class Example2 {
    public static void main(String[] args) {
    D objectD = new D();
    objectD.methodD(5);
    objectD.methodA(4);
    }
}

class A {
    int j = 0;
    public void methodA(int k) {
        j = k;
        System.out.println("Class A : j = " + j);
    }
}
 class B extends A {
    @Override
    public  void methodA(int x) { //method overridding
        j = x * x;
        System.out.println("Class B : j = " + 1);
    }
    public void methodB() {
        System.out.println("Class B");
    }
 }
class C extends  A {
    public void methodA(int k1) { // method overridding
        j = k1 * 5;
    }
    public void methodC() {
        System.out.println("Class C");
    }
}
class D extends B {
    public void methodD(int k) {
        j = k * k;
        System.out.println("Class D");
    }
}