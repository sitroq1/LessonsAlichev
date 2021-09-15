public class ClassesAndObjects {
    public static void main(String[] args) {
    Person person1 = new Person();
    person1.name = "Max";
    person1.age = 30;

    Person person2 = new Person();
    person2.name = "Alex";
    person2.age = 33;
    }

    Person person3 = new Person();
    person3.name = "Dima";
    person3.age = 35;
}
class Person {
    String name;
    int age;
}