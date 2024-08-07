package Task4;

import java.util.Scanner;

public class Weekday {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int j;
        System.out.println("enter the day's day:");
        j=sc.nextInt();
        String[] days={"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
        try {
            System.out.println("the required day is:"+days[j]);
        }
        catch (ArrayIndexOutOfBoundsException e2){
            System.out.println("the entered value is not between 0-6 ,please reenter the value within the range");
            System.out.println(e2);

        }
    }

}
