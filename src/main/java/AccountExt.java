public class AccountExt {


        String id;
        CustomerExt owner;
        int balance;

        public AccountExt(String id, CustomerExt owner, int balance) {
            this.id = id;
            this.owner = owner;
            this.balance = balance;
        }

        //getter
        public String getId() {
            return this.id;
        }

        public CustomerExt getName() {
            return this.owner;
        }
        public int getBalance() {
            return this.balance;
        }

        //setter
        public void setId(String id){
            this.id = id;
        }
        public void setName(CustomerExt owner){
            this.owner = owner;
        }
        public void setBalance(int balance){
            this.balance = balance;
        }

        @Override
        public String toString() {
            return "Account{" + "id='" + id + ", name='" + owner + ", balance=" + balance + '}';
        }

    }

