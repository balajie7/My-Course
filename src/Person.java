import java.time.Clock;
import java.util.Scanner;

public class Person {
    String name;
    int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;

    }
    void display(){
        System.out.println("Name of the person:" +name);
        System.out.println("Age of the person:" +age);
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Person person=new Person("bala",18);
        person.display();
    }
}
