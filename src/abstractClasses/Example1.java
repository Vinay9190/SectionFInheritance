package abstractClasses;

public class Example1 {
    public static void main(String[] args) {

    }

}
 abstract class Human { // this is now an  abstract class
    abstract public void talk();
    // this is now an abstract method.
    // abstract : something that is not properly defind
     // abstract method : a method whose body is not properly defind

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

