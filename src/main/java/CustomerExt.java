public class CustomerExt {

        int id;
        String firstName;
        String lastName;
        double heldMoney;
        double subtract;
        double current;

        public String getFullName(){
            return firstName + lastName;
        }

        public void subtractMoneyHeld (double heldMoney, double subtract){
            current = heldMoney - subtract;
        }

        public void setId( int id){
            String newID = String.valueOf(id);
        }

    }


