package ch13.generic;

public class Teacher<T, M> {
    private T number;
    private M name;

    public T getNumber() {
        return number;
    }
    public M getName() {
        return name;
    }
    public void setNumber(T number) {
        this.number = number;
    }
    public void setName(M name) {
        this.name = name;
    }
}
