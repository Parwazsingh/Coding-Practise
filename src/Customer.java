public class Customer {

    private String name;
    private String credit_limit;

    private String email_address;

    public String getName(){
        return name;
    }

    public String getCredit_limit() {
        return credit_limit;
    }

    public String getEmail_address() {
        return email_address;
    }
    public Customer(String name, String credit_limit, String email_address ){
        this.name = name;
        this.credit_limit = credit_limit;
        this.email_address = email_address;

    }
    public Customer(){
        this("helloji", "242342342", "helloji@gmail.com");
System.out.println("yooyohoney");

    }

    public Customer(String name,  String email_address){
        this(name, "242342342",email_address );
        System.out.println("yooyohoney");

    }


}
