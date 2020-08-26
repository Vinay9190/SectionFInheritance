package definitions;

public class Phone {
    private long contactNumber; // contact number of a phone itself.

    public long getContactNumber()
    {
        return contactNumber;
    }

    public void printContactNumber(long contactNumber)
    {
        this.contactNumber = contactNumber;
    }

}
