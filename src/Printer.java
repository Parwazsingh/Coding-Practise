public class Printer {

    private int tonerLevel;
    private int pagesPrinted;

    private boolean duplex;
    public Printer(int pagesPrinted) {
        this(85,pagesPrinted, true );
    }
    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        if(this.duplex == true){
            System.out.println("It can print pages on both sides");
        }
        else{
            System.out.println("It cannot print pages on both sides");
        }
    }

    public int addToner(int TonerAmount){
        tonerLevel = tonerLevel +  TonerAmount;
        if( tonerLevel < 100 & tonerLevel > 0 ){
            return tonerLevel;
        }
        else {
return  -1;
        }
        }

    public int printPages(int sheetNumber){
        sheetNumber = sheetNumber + pagesPrinted;
        if(this.duplex == true){
            System.out.println("It can print pages on both sides");
        }
       return sheetNumber;
    }
    }




