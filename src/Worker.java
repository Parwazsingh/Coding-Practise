public class Worker {

    private String name;
    private String birthDate;
    private String endDate;

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public Worker() {
    }



    public void getAge(int currentYear){


    }
    public void collectPay(){
        System.out.println("He should collect the pay till the month's end" + endDate);

    }
    public void terminate(String endDate){
        System.out.println(34.00);

    }

}
