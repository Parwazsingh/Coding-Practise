public class BankAccount {

    private int accountNumber;

    private int accountBalance;

    private String customerName;

    private String email;

    private int phoneNumber;

    public BankAccount(){
this(231323, 232434, "partysingh",  "parwazekam@mau.com", 3134123);
        System.out.println("Ajj toh krvaunii a teree baii na endd");
    }



    public BankAccount(int accountNumber, int accountBalance, String customerName, String email, int phoneNumber){
        System.out.println("Ajj toh krvaunii a teree baii na endd salleya ");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email  = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, int phoneNumber) {
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(int depositor){
        accountBalance = depositor ;
        System.out.println("I have got this number of amount" + accountBalance );
    }


    public void withdrawFunds(int withdrawal){
        accountBalance =   accountBalance - withdrawal  ;
        System.out.println("I have got left  number of amount" + accountBalance );
    }
}
