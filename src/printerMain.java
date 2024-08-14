public class printerMain {

    public static void main(String[] args) {
        Printer newprint = new Printer(85, 67, false);
        System.out.println(newprint.addToner(67));
        System.out.println(newprint.printPages(24));
    }
}
