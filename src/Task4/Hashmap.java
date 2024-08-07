package Task4;

import java.util.Scanner;
import java.util.Map;
import java.util.Scanner;

public class Hashmap<S, I extends Number> {

    public static void main(String[] args){
        Hashmap<String, Integer> students= new Hashmap<>();
        Scanner sc=new Scanner(System.in);
        String newStudent;
        System.out.println("Enter your Students:");
        do{
            System.out.println("Students:");
            newStudent=sc.nextLine();
            if(!newStudent.equals("")){
                System.out.println("Grade");
                int newGrade=sc.nextInt();
             //   students.put(newStudent, newGrade);
                sc.nextLine();
            }

        }while(!newStudent.equals(""));
            System.out.println("\nClass roster:");
            int sum=0;
            for(Map.Entry<String, Integer> student :students.entrySet()){
                System.out.println(student.getKey()+"("+student.getValue()+")");
                sum+=student.getValue();

            }
            int avg=sum / students.size();
            System.out.println("Average grade:"+ avg);

    }

    private I size() {

        return null;
    }

    private Iterable<? extends Map.Entry<String, Integer>> entrySet() {

        return null;
    }

}
