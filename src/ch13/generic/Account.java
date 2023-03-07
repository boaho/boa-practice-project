package ch13.generic;

public class Account<T, M> {
    private T code;
    private String name;
    private M client;
    private int balance;
    public T getCode() {
        return code;
    }

    public void setCode(T code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public M getClient() {
        return client;
    }

    public void setClient(M client) {
        this.client = client;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
