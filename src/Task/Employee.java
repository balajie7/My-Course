package Task;

public class Employee extends Person{
    int employeeId=123;
    int salary=40000;
    public static void main(String[] args){
        Person person= new Person();
        person.name="bala";
        person.age=22;
        System.out.println(person.name +" "+ person.age);

    }
}
