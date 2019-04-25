import java.awt.*;
import java.lang.Math;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        BankAccount myBankAccount = new BankAccount(4141, 300);
        //System.out.println(myBankAccount.accountBalance);

        myBankAccount.deposit(-400);
        myBankAccount.withdraw(345);

        myBankAccount.deposit(289);
        myBankAccount.withdraw(40);

    }

}
