package abstractClasses;

public class Example1 {
    public static void main(String[] args) {

    }

}
 class Human {
    public void talk() {
        System.out.println("");
    }
 }

class Student extends Human {
    @Override
    public void talk() {
        System.out.println("I am a Student");
    }

}

class Teacher extends  Human {
   @Override
    public void talk() {
       System.out.println("I am a Teacher");;
    }
}

