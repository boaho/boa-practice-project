package ch13.generic;

public class Record<T> {
    private T memo;

    public T getMemo() {
        return memo;
    }

    public void setMemo(T memo) {
        this.memo = memo;
    }
}
