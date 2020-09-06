package interfaces;

public interface Bank {

    // Fields
    // i. all the fields declared inside an interface must be initialized.
    // ii. all the fields declared inside an interfaces are implicity declared as public.
    // iii. all the fields declared inside an interface are implicity declared as final i.e we
    // cannot change its value after is has initialized.
    // all the fields declared inside an interface are implicitly declared as static.
    // public static final <data Type> <variableName> = <initialValues>;
    public final int number = 4;

    // 2. Methods
    // i. all the methd declared inside a interface are implicitly declared as abstract.
    // ii. all the methods declared inside an interface are implicitly declared as public.
    // public abstract <dataType> <methodName> (<Parameters>)K
    public abstract void method();
}
