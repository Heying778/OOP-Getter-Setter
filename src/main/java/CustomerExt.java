public class CustomerExt {
    private int id;
    private String firstName;
    private String lastName;

    public CustomerExt(String firstName, String lastName, double heldMoney) {
        this.id = (int) ( Math.random( ) * 1000 + 1);
        this.firstName = firstName;
        this.lastName = lastName;
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




    //additional functions
    public String getFullName() {
        return firstName+" "+lastName;
    }


    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + '}';
    }

}
