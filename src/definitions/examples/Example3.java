package definitions.examples;

public class Example3 {
    public static void main(String[] args) {
    B1 objectB1 = new B1();
    objectB1.setvalues(10,8);
    System.out.println("product :"+objectB1.product(10,9));
    C1 objectC1 = new C1();
    objectC1.setvalues(20,5);
    System.out.println("divison :"+ objectC1.division(20,5));
    }
}

class A1 {
    public int i, j;

    void setvalues(int x, int y) {
        i = x;
        j = y;
    }


    public int sum(int x, int y) {
        int sum = i + j;
        return sum;
    }
}

class B1 extends A1 {
    public int product(int x, int y) {
        int product = i * j;
        return product;
    }
}

class C1 extends A1 {
    public int division(int x, int y) {
        int divison = x / y;
        return divison;
    }


    public int difference(int x, int y) {
        int difference = x - y;
        return difference;
    }
    }