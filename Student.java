public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void details() {
        System.out.print("Name:" + name);
        System.out.print("Age:" + age);
    }

    public static void main(String[] args) {
        Student s = new Student("Ankit" +" ",  24);
        s.details();
    }
}
