public class Driver3 {
    public static void main(String[] args) {
        Account a1 = new Account("AC0001", "Riya", 4000);
        Account a2 = new Account("AC0001", "Rahul", 7000);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a1.equals(a2));
        if (a1 instanceof Account)
            System.out.println("a1 is an Account");
        Customer.Address add = new Customer.Address(
                "12, MG Road",
                "Ahmedabad",
                "380001");
        Customer c1 = new Customer("Krisha", add);
        Customer c2 = c1.clone();
        System.out.println(c1.getAddress().getLine());
        System.out.println(c1.getAddress().getCity());
        System.out.println(c1.getAddress().getPincode());
        if (c2 != null)
            System.out.println("Customer cloned successfully");
    }
}