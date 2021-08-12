package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
/*
  Create a new class for a bank account
  Create fields for the account number, balance, customer name, email and phone number.

  Create getters and setters for each field.
  Create two additional methods
  1. To allow the customer to deposit funds (this should increment the balance field).
  2. To allow the customer to withdraw funds (this should deduct from the balance field).

  Do not allow the withdrawal to complete if there are insufficient funds.

  You will want to create various code in Main class (the one created by IntelliJ) to confirm your code is working.
  Add some System.out.println's in the two methods above as well.
*/

//    Account bobsAccount = new Account(); // ("12345", 0.0, "Bob Brown", "myemail@bob.com", "(800) 123-4567");
//    System.out.println(bobsAccount.getNumber());
//    System.out.println(bobsAccount.getBalance());
//
//    bobsAccount.deposit(50.0);
//    bobsAccount.withdrawal(100.0);
//
//    bobsAccount.deposit(51.0);
//    bobsAccount.withdrawal(100.0);
//
//    Account lanasAccount = new Account("Lana", "lana@email.com", "12345");
//    System.out.println(lanasAccount.getNumber() + " name " + lanasAccount.getCustomerName());
//    System.out.println("Current balance is " + lanasAccount.getBalance());
//    lanasAccount.withdrawal(100.55);

/*    Create a new class VipCustomer
      It should have 3 fields: name, credit limit, and email address
      Create 3 constructors
      1st constructor empty should call the constructor with 3 parameters with default values
      2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
      3rd constructor should save all fields
      Create getters only for this using code generation of IntelliJ as setter won't be needed
      Test and confirm it works
    */

        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getName());

        VipCustomer customer2 = new VipCustomer("Bob", 25000.0);
        System.out.println(customer2.getName());

        VipCustomer customer3 = new VipCustomer("Lana", 100.0, "lana@email.com");
        System.out.println(customer3.getName());
        System.out.println(customer3.getEmailAddress());
    }
}
