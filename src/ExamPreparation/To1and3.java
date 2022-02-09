package ExamPreparation;

import java.util.ArrayList;
import java.util.List;

public class To1and3 {
    static List<String> listList = new ArrayList<>();
    static String list = "";
    public static void to(int in)
    {
        if(in <= 0)
        {
            listList.add(list);
            return;
        }
        list += "1";
        to(in - 1);
        list = list.substring(0,list.length()-1);
        if(in >= 3)
        {
            list += "3";
            to(in - 3);
            list = list.substring(0,list.length()-1);
        }
    }

    public static void main(String[] args) {
        to(4);
        System.out.println(listList);
    }
}
