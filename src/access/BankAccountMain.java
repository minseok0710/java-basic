package access;

public class BankAccountMain {
    static void main() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10000);
        bankAccount.withdraw(3000);
        System.out.println(bankAccount.getBalance());
    }
}
