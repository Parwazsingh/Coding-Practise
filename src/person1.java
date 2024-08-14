public class person1 {

   private String age;

   private String name;

    public person1(String age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        person1  personlull= new person1("23", "kfnwnf");
        person1  persondamnn= new person1("67", "kfnwbjkk");

        System.out.println(personlull.getAge());
        personlull.getName();

    }
}
