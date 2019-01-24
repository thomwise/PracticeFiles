public class BankAccount {

    private int accountNumber;
    private int accountBalance;

    public BankAccount(int accountNumber, int accountBalance) {

        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        System.out.println("You created account number " + this.accountNumber + ".");
    }

    public void deposit(int addMoney) {

        if (addMoney < 0) {

            System.out.println("You cannot deposit a negative amount.");

        } else {

            this.accountBalance = this.accountBalance + addMoney;
            System.out.println("$" + addMoney + " deposited into account " + this.accountNumber + ".");

        }
    }

    public void withdraw(int removeMoney) {

        if (removeMoney > this.accountBalance) {

            System.out.println("You cannot remove more money than is in your account.");

        } else {

            this.accountBalance = this.accountBalance - removeMoney;
            System.out.println("$" + removeMoney + " has been removed from account " + this.accountNumber + ".");

            System.out.println("Remaining balance is $" + this.accountBalance);
        }

    }

}
