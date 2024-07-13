class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("writing something");
    }

    public void printcolor() {
        System.out.println(this.color);
    }
}
class student{
String name;
int age;

public void printInfo(String name) {
        System.out.println(name);
}

public void printInfo(int age) {
    System.out.println(age);
}

    public void printInfo(String name, int age) {
        System.out.println(name + age);
    }

//public void printInfo(){
//    System.out.println(this.name);
//    System.out.println(this.age);
//}
//
//student(String name, int age){
//    this.name = name;
//    this.age = age;

}



public class OOPS {

    public static void main(String args[]) {
Pen pen1 = new Pen();
pen1.color = "blue";
pen1.type = "gel";

pen1.write();

Pen pen2 = new Pen();
pen2.color = "black";
pen2.type = "ballpoint";

pen1.printcolor();
pen2.printcolor();

student s1 = new student();
s1.name = "aman";
s1.age = 24;

        s1.printInfo(s1.name, s1.age);


//student s1 = new student();
//s1.name = "sharmin";
//s1.age = 22;
//
//        s1.printInfo();
    }
}