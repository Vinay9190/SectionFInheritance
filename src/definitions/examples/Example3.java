    package definitions.examples;

    public class Example3 {
        public static void main(String[] args) {

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
        public int division(int x , int y) {
            int divison = x / y;
            return divison;
        }
 }
