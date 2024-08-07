package Task4;

import java.util.Scanner;

public class Voter extends Exception{
    Voter(String m){
        super(m);
    }

    public static class Age{
        public Age(int x,int z,String y){
            try{
                if(z<18)
                    throw new Voter("Invalid age for Voter");
                System.out.println("you are eligible to vote:");
            }
            catch(Voter e){
                System.out.println(e.getMessage());
            }
        }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Id:");
            int a= sc.nextInt();
            System.out.println("Enter the Name:");
            String c=sc.next();
            System.out.println("Enter the Age:");
            int b=sc.nextInt();
            Age age=new Age(a,b,c);

        }
    }
}
