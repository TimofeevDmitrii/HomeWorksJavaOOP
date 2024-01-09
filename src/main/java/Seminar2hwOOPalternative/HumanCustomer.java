package Seminar2hwOOPalternative;

public class HumanCustomer extends Actor {
    int contactNumber;
    public HumanCustomer(String name, int contactNumber) {
        super(name);
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString(){
        return String.format("%s, %s, %d", type,name,contactNumber);
    }
}
