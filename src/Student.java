public class Student {

    private String id;
    private String name;
    private String  dateofbirth;
    private String classList;

    public Student(String id, String name, String dateofbirth, String classList) {
        this.id = id;
        this.name = name;
        this.dateofbirth = dateofbirth;
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateofbirth='" + dateofbirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }
}
