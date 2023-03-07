package ch13.generic;

public class Util {
    public static<K, V> boolean compareValue(Teacher t1, Teacher t2){
        boolean compareNum = t1.getNumber().equals(t2.getNumber());
        boolean compareName = t1.getName().equals(t2.getName());

        return compareNum && compareName;
    }
}
