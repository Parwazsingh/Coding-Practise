public class smartkitchen {

    private CoffeeMaker brewMaster;

    private DishWasher dishwasher;

    private Refrigerator iceBox;

    public void addWater(){

    }


    public smartkitchen(CoffeeMaker brewMaster, DishWasher dishwasher, Refrigerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishwasher = dishwasher;
        this.iceBox = iceBox;
    }
}


class CoffeeMaker{
    private boolean hasWorkToDo;

    public CoffeeMaker(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void brewCoffee(){
        if(hasWorkToDo == true){
            System.out.println("work is being done");
        }


}
}

class Refrigerator{
    private boolean hasWorkToDo;

    public Refrigerator(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void orderFood(){
        if(hasWorkToDo == true){
            System.out.println("work is being done");
        }


    }
}

class DishWasher{
    private boolean hasWorkToDo;

    public DishWasher(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void doDishes(){
        if(hasWorkToDo == true){
            System.out.println("work is being done");
        }


    }
}