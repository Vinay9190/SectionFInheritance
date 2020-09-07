package interfaces;

public interface IOBBank {

    // for inheriting class
    // the extends keyword

    // for inherinting interfaces  we use:
    // the implements keyword

    class IOBBank implements Bank {
       @Override
        public void createAccount() {
           System.out.println(" ASK FOR NAME,AGE, EMAIL");
       }
    }

    class SBIBank implements Bank, ATM {
        @Override
        public void createAccount() {
            System.out.println("ASK ONLY FOR NAME" );
        }
    }
}
