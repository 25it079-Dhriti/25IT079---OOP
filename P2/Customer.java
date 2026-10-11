class Customer {
    private String customerName;
    private String email;
    private String mobile;
    private final String customerId;
    private static int idNumber = 101;
    static String generateCustomerId() {
        return "CUST" + idNumber++;
    }
    Customer(String customerName, String email, String mobile) {
        this.customerName = customerName;
        this.email = email;
        this.mobile = mobile;
        customerId = generateCustomerId();
    }
    String getName() {
        return customerName;
    }
    String getEmail() {
        return email;
    }
    String getMobile() {
        return mobile;
    }
    String getCustomerId() {
        return customerId;
    }
}