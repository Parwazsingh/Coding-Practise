import java.util.ArrayList;

public class addinginventory {

    public ArrayList<inventory>inventorymethods;
    public addinginventory() {
        inventorymethods = new ArrayList<inventory>(); // Ensure it's initialized
    }

    public void setInventorymethods() {

        inventorymethods = new ArrayList<inventory>();
    }

    public ArrayList<inventory> getInventorymethods() {
        return inventorymethods;
    }


    public void addinventory(inventory lulla){
        inventorymethods.add(lulla);
    }

    public void removeinventory(inventory lulla){
        inventorymethods.remove(lulla);
    }


    public static void main(String[] args) {

        addinginventory mightuse = new  addinginventory();
        inventory myit = new inventory("chisel", "dangerous", "929402");
        inventory hilarious = new inventory("chakku", "nitdangerous", "98293");
        inventory mighty = new inventory("jal", "maska", "89865");

        mightuse.addinventory(myit);
        mightuse.addinventory(hilarious);
        mightuse.addinventory(mighty);



        mightuse.removeinventory(myit);

        System.out.println(mightuse.inventorymethods);

        if(mightuse.inventorymethods.size() < 3){
            System.out.println("very less appliances");
        }
        else{
            System.out.println("there are many places there");
        }

    }
}

