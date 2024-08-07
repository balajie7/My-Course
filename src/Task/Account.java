package Task;

import java.util.Scanner;

public class Account {
    private int balance=5000;
    public int balance(){
        return balance;
    }
    public void withdraw(int amt){
        if(amt>balance){
            System.out.println("Insufficient Balance ");
        }
        balance=balance-amt;
    }
    public void deposit(int amt){
        if(amt<=0){
            System.out.println("Enter valid Amount");
        }
        balance=balance+amt;
    }

    public static void main(String[] args){
        Account act =new Account();
        Scanner scanner=new Scanner(System.in);
        int pid = scanner.nextInt();
        System.out.println("Please enter the Amount: ");

    }
}
