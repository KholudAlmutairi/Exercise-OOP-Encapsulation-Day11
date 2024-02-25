
        public class Main {
            public static void main(String[] args) {

                //-----------------------------------------Account Class----------------------------------
                // Create an account
                Account account1 = new Account("123456789", "Kholud");

                // Credit some amount
                account1.credit(1000);

                // Print account details
                System.out.println("Account details:");
                System.out.println(account1);

                // Debit some amount
                account1.debit(200);

                // Print updated account details
                System.out.println("Updated account details:");
                System.out.println(account1);

                // Create another account
                Account account2 = new Account("987654321", "Kholud Mohammed", 500);

                // Transfer from account1 to account2
                account1.transferTo(account2, 300);

                // Print updated account details after transfer
                System.out.println("Account 1 details after transfer:");
                System.out.println(account1);
                System.out.println("Account 2 details after transfer:");
                System.out.println(account2);
                //-----------------------------------------Employee Class----------------------------------

                // Create an employee
                Employee employee1 = new Employee("K123", "Kholud", 50000);

                // Print employee details
                System.out.println("Employee details:");
                System.out.println(employee1);

                // Get and print annual salary
                int annualSalary = employee1.AnnualSalary();
                System.out.println("Annual salary: " + annualSalary);

                // Raise employee salary by 10%
                employee1.raiseSalary(10);

                // Print updated employee details
                System.out.println("Updated employee details after raise:");
                System.out.println(employee1);

                // Get and print updated annual salary
                int updatedAnnualSalary = employee1.AnnualSalary();
                System.out.println("Updated annual salary: " + updatedAnnualSalary);
            }
        }







