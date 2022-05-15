package src;

import java.math.BigDecimal;
import java.util.Scanner;

public class HandleAccount {

    private static Account account = new Account();

    public static void main(String[] arg){

        String entScreen = "Welcome on your account manager!!!\n" +
                "Actions' list :\n" +
                "make a deposit (d)\n" +
                "make a withdraw (w)\n" +
                "list all the operations (l)\n" +
                "calculate the balance of the account (c)\n" +
                "quit (q)\n";

        System.out.println(entScreen);

        Scanner sc = new Scanner(System.in);

        char choice = ' ';

        while(choice != 'q') {

            System.out.print("Enter your choice (d/w/l/c/q) : ");

            choice = sc.next().charAt(0);

            switch (choice) {
                case 'd':
                    makeDeposit();
                    break;
                case 'w':
                    makeWithdrawal();
                    break;
                case 'l':
                    listOperations();
                    break;
                case 'c':
                    calculatePrice();
                    break;
                case 'q':
                    System.out.println("bye");
                    break;
                default:
                    System.out.println("bad command");
                    break;
            }
        }
    }

    private static void makeDeposit(){
        System.out.print("Enter an amount : ");
        Scanner sc = new Scanner(System.in);

        BigDecimal amount = BigDecimal.ZERO;
        try {
            amount = new BigDecimal(sc.next());
        }catch(NumberFormatException e){
            System.out.println("the value is not a number");
            return;
        }

        account.makeDeposit(amount);
    }

    private static void makeWithdrawal(){
        System.out.print("Enter an amount : ");
        Scanner sc = new Scanner(System.in);

        BigDecimal amount = BigDecimal.ZERO;
        try {
            amount = new BigDecimal(sc.next());
        }catch(NumberFormatException e){
            System.out.println("the value is not a number");
            return;
        }

        account.makeWithdrawal(amount);
    }

    private static void listOperations(){
        System.out.println(account.listOperations());
    }

    private static void calculatePrice(){
        System.out.println(account.calculateBalance());
    }
}
