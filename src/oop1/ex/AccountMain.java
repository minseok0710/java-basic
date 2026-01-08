package oop1.ex;

public class AccountMain {
    static void main() {
        Account account = new Account();

        account.balance = 0;

        // 만원 입금
        account.deposit(10000);
        //9000원 출금
        account.withdraw(9000);
        //2000원 출금 시도, 잔액부족 출력 확인
        account.withdraw(2000);
        //잔고 출력
        account.balanceStatus();
    }
}