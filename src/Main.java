
import ch13.generic.Teacher;
import ch13.generic.Util;
import java.util.*;

import java.util.List;

public class Main {

    /* ch15.collection main*/
    public static void main(String[] args)
    {
        //List<String> list = new ArrayList<String>();
        //List<String> list = new ArrayList<String>(30);
        String[] array = new String[]{"지갑", "가습기", "핸드폰"};


        List<String> list = new ArrayList<String>();
        list.add("지갑");
        list.add("가습기");
        list.add("핸드폰");

    }

    /* ch13.generic main
    public static void main(String[] args)
    {
        Teacher<Integer, String> teacher1 = new Teacher<Integer, String>();
        teacher1.setNumber(1);
        teacher1.setName("한보아");

        Teacher<Integer, String> teacher2 = new Teacher<Integer, String>();
        teacher2.setNumber(2);
        teacher2.setName("정진수");

        Util util = new Util();
        boolean result = util.compareValue(teacher1, teacher2);

        if(result){
            System.out.println("동일한 정보 입니다.");
        }else{
            System.out.println("일치하지 않습니다.");
        }
    }*/
}