public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Max";
        person1.age = 30;
        System.out.println("Вас зовут " + person1.name + ", Вам " + person1.age + " лет");

        Person person2 = new Person();
        person2.name = "Alex";
        person2.age = 33;
        System.out.println("Вас зовут " + person2.name + ", Вам " + person2.age + " лет");


    }
}
class Person {
    String name;
    int age;
}