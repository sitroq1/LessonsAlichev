public class ClassesAndObjects {
    public static void main(String[] args) {
    Person person1 = new Person();
    person1.name = "Max";
    person1.age = 30;

    Person person2 = new Person();
    person2.name = "Alex";
    person2.age = 33;
    }
}
class Person {
    String name;
    int age;
}