public class Account {

        private String id;
        private String name;
        private int balance;

        // Constructors
        public Account(String id, String name) {
            this.id = id;
            this.name = name;
            this.balance = 0;
        }

        public Account(String id, String name, int balance) {
            this.id = id;
            this.name = name;
            this.balance = balance;
        }

        // Getters
        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getBalance() {
            return balance;
        }

        // Methods
        public int credit(int amount) {
            balance += amount;
            return balance;
        }

        public int debit(int amount) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Insufficient funds");
            }
            return balance;
        }

        public int transferTo(Account another, int amount) {
            if (amount <= balance) {
                debit(amount);
                another.credit(amount);
            } else {
                System.out.println("Insufficient funds");
            }
            return balance;
        }

        @Override
        public String toString() {
            return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
        }
    }


