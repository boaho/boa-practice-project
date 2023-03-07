package ch13.generic;

public class AccountUtil {

    public static<T, M> void accountTransfer(int amount, Account<T, M> account1, Account<T, M> account2){
        System.out.println();
        Account<T, M> sender = (Account<T, M>) account1;
        Account<T, M> giver = (Account<T, M>) account2;

        int senderBalance = sender.getBalance();
        int giverBalance = giver.getBalance();
        account1.setBalance(senderBalance - amount);
        account2.setBalance(giverBalance + amount);
        System.out.println("계좌 이체 되었습니다.");

    }
}
