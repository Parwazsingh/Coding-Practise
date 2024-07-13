public class Car {


    private String  make = "BMW";
    private String model = "M4";
    private String color = "Blue";
    private int doors = 4;
    private boolean convertible = true;

    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }


    public void setMake(String make){
if(make == null) make = "Unknown";
String lowercaseMake = make.toLowerCase();
switch(lowercaseMake){
    case "holden", "porsche", "tesla" -> this.make = make;
    default -> {
        this.make = "Unsupported";

    }

}
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void describeCar(){

        System.out.println(doors + "-Door" +
                color + " " +
                make + " " +
                model + " "  );


    }

}