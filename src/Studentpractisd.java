public class Studentpractisd {

    private  String name;

    private  int salary;
    private int hire;

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getHire() {
        return hire;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setHire(int hire) {
        this.hire = hire;
    }

    public Studentpractisd(String name, int salary, int hire) {
        this.name = name;
        this.salary = salary;
        this.hire = hire;
    }

    public void yearsofservice(){
        if(salary>145 & hire> 2000){
            System.out.println("he will get a lot of pay else not");

        }
        else{
            System.out.println("your guy is poor");
        }
    }


    public static void main(String[] args) {
        Studentpractisd wrerwr = new  Studentpractisd("LULLA", 456789, 2001);
        wrerwr.yearsofservice();
    }



}
