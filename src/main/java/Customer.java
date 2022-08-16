public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private double heldMoney;

    public Customer(String firstName, String lastName, double heldMoney) {
        this.id = (int) (Math.random()*1000 + 1);
        this.firstName = firstName;
        this.lastName = lastName;
        this.heldMoney = heldMoney;
    }

    //getter
    public int getId() {
        return id;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getHeldMoney() {
        return heldMoney;
    }

    //setter
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setHeldMoney(double heldMoney) {
        this.heldMoney = heldMoney;
    }



//additional functions
    public String getFullName() {
        return firstName+" "+lastName;
    }

    public void subtractHeldMoney(double deduction) {
        setHeldMoney(heldMoney - deduction);
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", heldMoney=" + heldMoney + '}';
    }

}
