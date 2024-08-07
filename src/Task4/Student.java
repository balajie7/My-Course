package Task4;

import java.util.Scanner;

public class Student {



    int roll,age;
    String name,course;
    Student(){
        roll=0;
        name=null;
        age=0;
        course=null;
        Scanner obj = new Scanner(System.in);
        String userInput = obj.next();
        System.out.println("The Input Provided is: " + userInput);


    }
    Student(int r,String n,int a,String c){
        roll=r;
        course=c;
        int l,temp=0;
        l=n.length();
        for(int i=0;i<l;i++) {
            char ch;
            ch = n.charAt(i);
            if (ch <'a'||ch >'z'&&ch <'A'||ch >'Z')
                temp = 1;
        }
        try{
            if(temp==1)
                throw new NameNotValidException();
            else
                name=n;
        }
        catch (NameNotValidException e2){
            System.out.println(e2);
        }
        try {
            if(a>=15&&a<=21)
                age=a;
            else
                throw new AgeNotInRangeException();
        }
        catch (AgeNotInRangeException e1){
            System.out.println(e1);
        }
    }
    void display(){
        System.out.println(roll+" "+name+" "+age+" "+course);
    }

    public static class AgeNotInRangeException extends Exception{
        public String toString(){
            return ("Age is not between 15 and 21");
        }
    }

    public static class NameNotValidException extends Exception{
        public String validname() {
            return ("Name is not Valid .Please Reenter the Name ");
        }
    }
}
