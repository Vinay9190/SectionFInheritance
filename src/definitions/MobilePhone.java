package definitions;

    // a simple mobile phone like Noika 1100
    public class MobilePhone extends Phone {
    // MobilePhone extends Phone
    // MobilePhone IS a type of phone
        public void printContactNumber() {
            System.out.println(getContactNumber());
        }
}

// Two entities; every entity is a class,
// first entity (class: Phone.java class
// second entity (class) : MobilePhone.java class
// is somehow relate the two classes (entities)