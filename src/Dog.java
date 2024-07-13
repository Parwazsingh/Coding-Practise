public class Dog extends Animal{

    private String earshape;
    private String tailShape;

public Dog(){
    super("Mutt", "Big", 50);
}


public Dog(String type, double weight){
    this(type, weight, "Perky" , "Curled");
}

    public Dog(String type, double weight, String earshape, String tailShape) {
        super(type, weight <  15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earshape = earshape;
        this.tailShape = tailShape;
    }
    public void makeNoise(){
    if(type == "wolf"){
        System.out.print("Ow woooo");
    }
    bark();
    System.out.println();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earshape='" + earshape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void move(String speed){
    super.move(speed);
//    System.out.println("Dogs walk, run and can wag their tail");
      if(speed == "slow") {
          walk();
          wagTail();
      }
      else{
          run();
          bark();
      }
      System.out.println();
    }

private void bark(){
    System.out.print("Woof !");

}
    private void run(){
        System.out.print("duggar!");

    }
    private void walk(){
        System.out.print("dog walking");

    }

    private void wagTail(){
        System.out.print("tail wagginggg");

    }
}
