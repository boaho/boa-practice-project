package ch13.generic;

public class Device<T, M> {
    private T code;
    private M kind;
    private String name;

    public T getCode() {
        return code;
    }
    public M getKind() {
        return kind;
    }
    public String getName() {
        return name;
    }
    public void setCode(T code) {
        this.code = code;
    }
    public void setKind(M kind) {
        this.kind = kind;
    }
    public void setName(String name) {
        this.name = name;
    }
}
